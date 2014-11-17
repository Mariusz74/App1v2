//Mariusz S
package com.group3.jdbctemplate.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.group3.domain.LecturerImpl;
import com.group3.domain.ModuleImpl;
import com.group3.interfaces.Module;
import com.group3.interfaces.Program;
import com.group3.jdbctemplate.dao.ModuleDAO;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository //mikhail:added repository stereotype
public class ModuleJDBCTemplate implements ModuleDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public void setDataSource(DataSource ds) {
		dataSource = ds;
		jdbcTemplateObject = new JdbcTemplate(ds);
	}

	@Override
	public int createModule(String name) {
		String SQL = "insert into Module (name) values (?)";
		return jdbcTemplateObject.update(SQL, new Object[] { name });
		// System.out.println("Created Module Name = " + name );
		
	}

	@Override
	public int deleteModule(Integer id) {
		String SQL = "delete from Module where id = ?";
		return jdbcTemplateObject.update(SQL, new Object[] {id});
		//System.out.println("Deleted Module with ID = " + id );	
		
	}

	@Override
	public int updateModule(Integer id, String name) {
		String SQL = "update Module set name = ? where id = ?";
		return jdbcTemplateObject.update(SQL,  new Object[] {name, id});
		//System.out.println("Updated Module with ID = " + id );
			
	}
	
	/**
	 * @ Author: Donal
	 */
	public List<Module> getAll() {
		String sql = "select * from Module";
		
		List<Module> modules = jdbcTemplateObject.query(sql, 
				new ModuleRowMapper());
		return modules;

	}

	/**
	 * @ Author: Donal
	 */
	@SuppressWarnings("unchecked")
	public Module find(int ID) {
	String sql = "select * from Module where id= ?";
		
		Module modules = (Module) jdbcTemplateObject.queryForObject(sql, 
				  new Object[] {ID}, new ModuleRowMapper());
		return modules;
	
	}
	
	/*
	 * row mapper class for Module. 
	*/	
	@SuppressWarnings("rawtypes")
	//Author:Dónal
	public class ModuleRowMapper implements RowMapper{

		@Override
		public Object mapRow(ResultSet rs, int rowID) throws SQLException {
			ModuleImpl module = new ModuleImpl(
					rs.getString("name"),rs.getInt("id")
					);
			return module;
		}
			
			
							
		
	}
	
}


