package com.group3.jdbctemplate.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.group3.jdbctemplate.dao.DeferralModuleDAO;

public class DeferralModuleJDBCTemplate implements DeferralModuleDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public void setDataSource(DataSource ds) {
		dataSource = ds;
		jdbcTemplateObject = new JdbcTemplate(ds);
	}

	@Override
	public int createDeferralModule(int idDeferral, int idModule) {	
		String SQL = "insert into DeferralModule (idDeferral, idModule) values (?, ?)";
		System.out.println("Created DeferralModule = " + idDeferral + " " + idModule);		
		return jdbcTemplateObject.update(SQL, new Object[] { idDeferral, idModule });	
	}

	@Override
	public int deleteDeferralModule(int id) {
		String SQL = "delete from DeferralModule where id = ?";
		System.out.println("Deleted DeferralModule with ID = " + id );
		return jdbcTemplateObject.update(SQL, new Object[] {id});	
	}

	@Override
	public int updateDeferralModule(int id, int idDeferral, int idModule) {
		String SQL = "update DeferralModule set idDeferral = ?, idModule = ? where id = ?";
		System.out.println("Updated DeferralModule with ID = " + id + " idDeferral = " + idDeferral + " idModule = " + idModule);
		return jdbcTemplateObject.update(SQL,  new Object[] {idDeferral, idModule, id});
	}

}
