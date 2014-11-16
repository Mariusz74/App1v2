// Mariusz S
package com.group3.jdbctemplate.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.EmptyStackException;
import java.util.List;

import javax.sql.DataSource;

import com.group3.domain.ProgramImpl;
import com.group3.interfaces.Program;
import com.group3.jdbctemplate.dao.ProgramDAO;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class ProgramJDBCTemplate implements ProgramDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public void setDataSource(DataSource ds) {
		dataSource = ds;
		jdbcTemplateObject = new JdbcTemplate(ds);
	}

	@Override
	public int createProgram(String name) {
		String SQL = "insert into Program (name) values (?)";
		KeyHolder holder = new GeneratedKeyHolder();
		return jdbcTemplateObject.update(SQL, new Object[] { name });

		//System.out.println("Created Program Name = " + name );
		
	}

	@Override
	public int deleteProgram(Integer id) {
		String SQL = "delete from Program where id = ?";
		return jdbcTemplateObject.update(SQL, new Object[] {id});
		//System.out.println("Deleted Program with ID = " + id );	
		
	}

	@Override
	public int updateProgram(Integer id, String name){
		String SQL = "update Program set name = ? where id = ?";
		return jdbcTemplateObject.update(SQL,  new Object[] {name, id});
		
	}
	
	/**@ Author: Mikhail
	 * Nov 16, 2014_6:17:01 PM
	 */
	public List<Program> getAll() {
		String sql = "select * from Program";
		
		List<Program> objs = jdbcTemplateObject.query(sql, 
				new SemesterRowMapper());
		return objs;

	}

	/**@ Author: Mikhail
	 * Nov 16, 2014_6:17:22 PM
	 */
	@SuppressWarnings("unchecked")
	public Program find(int ID) {
	String sql = "select * from Program where id= ?";
		
		Program obj = (Program) jdbcTemplateObject.queryForObject(sql, 
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
		ProgramImpl object = new ProgramImpl(
				rs.getString("name")
				);
		object.setID(rs.getInt("id"));
		return object;
	}
							
	}
}

