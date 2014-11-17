
/**
 * @Author: Mikhail Nov 16, 2014_11:04:08 AM
 */
package com.group3.jdbctemplate.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.group3.domain.LecturerImpl;
import com.group3.interfaces.Lecturer;
import com.group3.jdbctemplate.dao.LecturerDAO;


/**
 * @author Mikhail
 *
 * Nov 16, 2014_11:04:08 AM
 */
@Repository
public class LecturerJDBCTemplate implements LecturerDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	// @Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public int create(Lecturer lecturer) {
		String SQL = "insert into Lecturer (firstname, surname) values (?, ?)";
		return jdbcTemplateObject.update(SQL, new Object[] { lecturer.getFirstName(), lecturer.getSurName()});
		//System.out.println("Created Record Name = " + lecturer.getFirstName() + " " + lecturer.getSurName());
	}

	@Override
	public int delete(int id) {
		String SQL = "delete from Lecturer where id = ?";
		return jdbcTemplateObject.update(SQL, new Object[] {id});
		//System.out.println("Deleted Record with ID = " + id );
	}

	@Override
	public int update(Lecturer lecturer) {
		
		  
		String SQL = "update Lecturer set firstname = ?, surname = ?, login = ?, password = ?, email = ?, address = ? where id = ?";
		return jdbcTemplateObject.update(SQL,  new Object[] {lecturer.getFirstName(), lecturer.getSurName(), lecturer.getLogin(), lecturer.getPassword(), lecturer.getEmail(),lecturer.getAddress(),lecturer.getID()});
		//System.out.println("Updated Record with ID = " + lecturer.getID() );
		

	}

	@SuppressWarnings("unchecked")
	@Override
	//Author:Mikhail
	public Lecturer find(int ID) {

		String sql = "select * from Lecturer where id= ?";
		
		Lecturer lecturer = (Lecturer) jdbcTemplateObject.queryForObject(sql, 
				  new Object[] {ID}, new lecturerRowMapper());
		return lecturer;
	
		
	}

	@Override
	//Author:Mikhail
	public List<Lecturer> getAll() {
		String sql = "select * from Lecturer";
		
		List<Lecturer> lecturerList = jdbcTemplateObject.query(sql, 
				new lecturerRowMapper());
		return lecturerList;

	}
	
	@Override
	public int countRows() {
		String SQL = "select count(*) from Lecturer";
		//return row count
		return jdbcTemplateObject.queryForObject(SQL, Integer.class);
		
	}

	
/*row mapper class for lecturer. This is an inner class because there is no need for a rowmapper object 
 * to be DI to the lecturerTemplate or to be on a class of its own.
*/	
@SuppressWarnings("rawtypes")
//Author:Mikhail
public class lecturerRowMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowID) throws SQLException {
		LecturerImpl lecturer = new LecturerImpl(
				rs.getString("firstname"),rs.getString("surname")
				);
		lecturer.setAddress(rs.getString("address"));
		lecturer.setLogin(rs.getString("login"));
		lecturer.setEmail(rs.getString("email"));
		lecturer.setPassword(rs.getString("password"));
		lecturer.setID(rs.getInt("id"));
		return lecturer;
	}
		
		
						
	}



}

