// Mariusz S
package com.group3.jdbctemplate.dao.impl;

import java.util.EmptyStackException;

import javax.sql.DataSource;

import com.group3.jdbctemplate.dao.ProgramDAO;

import org.springframework.jdbc.core.JdbcTemplate;
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
	
}

