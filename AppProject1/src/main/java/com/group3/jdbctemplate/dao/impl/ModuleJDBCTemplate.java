//Mariusz S
package com.group3.jdbctemplate.dao.impl;

import javax.sql.DataSource;
import com.group3.jdbctemplate.dao.ModuleDAO;
import org.springframework.jdbc.core.JdbcTemplate;

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
	
}

