//Mariusz S
package com.group3.jdbctemplate.dao.impl;

import javax.sql.DataSource;

import com.group3.jdbctemplate.dao.ProgramSemesterDAO;

import org.springframework.jdbc.core.JdbcTemplate;

public class ProgramSemesterJDBCTemplate implements ProgramSemesterDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public void setDataSource(DataSource ds) {
		dataSource = ds;
		jdbcTemplateObject = new JdbcTemplate(ds);
	}

	@Override
	public int createProgramSemester(int idProgram, int idSemester) {
		String SQL = "insert into ProgramSemester (idProgram, idSemester) values (?, ?)";
		return jdbcTemplateObject.update(SQL, new Object[] { idProgram, idSemester });
		//System.out.println("Created ProgramSemester = " + idProgram + " " + idSemester);
		//return;	
	}

	@Override
	public int deleteProgramSemester(int id) {
		String SQL = "delete from ProgramSemester where id = ?";
		return jdbcTemplateObject.update(SQL, new Object[] {id});
		//System.out.println("Deleted ProgramSemester with ID = " + id );	
		//return;
	}

	@Override
	public int updateProgramSemester(int id, String name, int CompulsoryModuleQuantity) {
		String SQL = "update ProgramSemester set name = ?, CompulsoryModuleQuantity = ? where id = ?";
		return jdbcTemplateObject.update(SQL,  new Object[] {name, CompulsoryModuleQuantity, id});
		//System.out.println("Updated ProgramSemester with ID = " + id + " name = " + name + " quantity = " + CompulsoryModuleQuantity);
			
	}
	
	@Override
	public int updateProgramSemester2(int id, int idProgram, int idSemester) {
		String SQL = "update ProgramSemester set idProgram = ?, idSemester = ? where id = ?";
		return jdbcTemplateObject.update(SQL,  new Object[] {idProgram, idSemester, id});
		//System.out.println("Updated ProgramSemester with ID = " + id + " name = " + idProgram + " quantity = " + idSemester );
			
	}
	
}

