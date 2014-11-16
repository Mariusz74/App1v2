// Mariusz S
package com.group3.jdbctemplate.dao.impl;

import javax.sql.DataSource;
import com.group3.jdbctemplate.dao.ProgramDAO;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProgramJDBCTemplate implements ProgramDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public void setDataSource(DataSource ds) {
		dataSource = ds;
		jdbcTemplateObject = new JdbcTemplate(ds);
	}

	@Override
	public void createProgram(String name) {
		String SQL = "insert into Program (name) values (?)";
		jdbcTemplateObject.update(SQL, new Object[] { name });
		System.out.println("Created Program Name = " + name );
		return;	
	}

	@Override
	public void deleteProgram(Integer id) {
		String SQL = "delete from Program where id = ?";
		jdbcTemplateObject.update(SQL, new Object[] {id});
		System.out.println("Deleted Program with ID = " + id );	
		return;
	}

	@Override
	public void updateProgram(Integer id, String name) {
		String SQL = "update Program set name = ? where id = ?";
		jdbcTemplateObject.update(SQL,  new Object[] {name, id});
		System.out.println("Updated Program with ID = " + id );
		return;	
	}
	
}

