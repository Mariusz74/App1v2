//Mariusz S
package com.group3.jdbctemplate.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.group3.domain.LecturerImpl;
import com.group3.domain.SemesterImpl;
import com.group3.interfaces.Lecturer;
import com.group3.interfaces.Program;
import com.group3.interfaces.Semester;
import com.group3.jdbctemplate.dao.ProgramSemesterDAO;
import com.group3.jdbctemplate.dao.impl.LecturerJDBCTemplate.lecturerRowMapper;
import com.group3.jdbctemplate.dao.impl.SemesterJDBCTemplate.SemesterRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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

