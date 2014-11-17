// Mariusz S
package com.group3.jdbctemplate.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;



import com.group3.domain.SemesterImpl;
import com.group3.interfaces.Semester;
import com.group3.jdbctemplate.dao.SemesterDAO;
import com.group3.jdbctemplate.dao.impl.LecturerJDBCTemplate.lecturerRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository //mikhail:added repository stereotype
public class SemesterJDBCTemplate implements SemesterDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	// @Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}


	@Override
	public int createSemester(String name) {
		String SQL = "insert into Semester (name) values (?)";
		return jdbcTemplateObject.update(SQL, new Object[] { name });
		//System.out.println("Created Semester Name = " + name );
		//return;	
	}

	@Override
	public int deleteSemester(Integer id) {
		String SQL = "delete from Semester where id = ?";
		return jdbcTemplateObject.update(SQL, new Object[] {id});
		//System.out.println("Deleted Semester with ID = " + id );	
		//return;
	}

	@Override
	public int updateSemester(Integer id, String name) {
		String SQL = "update Semester set name = ? where id = ?";
		return jdbcTemplateObject.update(SQL,  new Object[] {name, id});
		//System.out.println("Updated Semester with ID = " + id );
		//return;	
	}

	/**@ Author: Mikhail
	 * Nov 16, 2014_6:17:01 PM
	 */
	public List<Semester> getAll() {
		String sql = "select * from Semester";
		
		List<Semester> objs = jdbcTemplateObject.query(sql, 
				new SemesterRowMapper());
		return objs;

	}

	/**@ Author: Mikhail
	 * Nov 16, 2014_6:17:22 PM
	 */
	@SuppressWarnings("unchecked")
	public Semester find(int ID) {
	String sql = "select * from Semester where id= ?";
		
		Semester obj = (Semester) jdbcTemplateObject.queryForObject(sql, 
				  new Object[] {ID}, new SemesterRowMapper());
		return obj;
	
	}
	
	
	/*row mapper class for lecturer. This is an inner class because there is no need for a rowmapper object 
	 * to be DI to the lecturerTemplate or to be on a class of its own.
	*/	
	@SuppressWarnings("rawtypes")
	public class SemesterRowMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowID) throws SQLException {
		SemesterImpl object = new SemesterImpl(
				rs.getString("name")
				);
		object.setID(rs.getInt("id"));
		return object;
	}
							
	}
}


