package com.group3.jdbctemplate.dao.impl;

import javax.sql.DataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.group3.domain.LecturerImpl;
import com.group3.domain.ModuleImpl;
import com.group3.domain.ProgramSemesterImpl;
import com.group3.domain.SemesterImpl;
import com.group3.interfaces.Lecturer;
import com.group3.interfaces.Module;
import com.group3.interfaces.Program;
import com.group3.interfaces.ProgramSemester;
import com.group3.interfaces.Semester;
import com.group3.jdbctemplate.dao.ProgramSemesterDAO;
import com.group3.jdbctemplate.dao.impl.LecturerJDBCTemplate.lecturerRowMapper;
import com.group3.jdbctemplate.dao.impl.ModuleJDBCTemplate.ModuleRowMapper;
import com.group3.jdbctemplate.dao.impl.SemesterJDBCTemplate.SemesterRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.group3.jdbctemplate.dao.ProgramSemesterModuleLecturerDAO;

public class ProgramSemesterModuleLecturerJDBCTemplate implements ProgramSemesterModuleLecturerDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public void setDataSource(DataSource ds) {
		dataSource = ds;
		jdbcTemplateObject = new JdbcTemplate(ds);
	}

	@Override
	public int createProgramSemesterModuleLecturer(int idProgramSemester, int idModuleLecturer) {
		String SQL = "insert into ProgramSemesterModuleLecturer (idProgramSemester, idModuleLecturer) values (?, ?)";
		System.out.println("Created ProgramSemester = " + idProgramSemester + " " + idModuleLecturer);
		return jdbcTemplateObject.update(SQL, new Object[] { idProgramSemester, idModuleLecturer });
		//return;	
	}

	@Override
	public int deleteProgramSemesterModuleLecturer(int id) {
		String SQL = "delete from ProgramSemesterModuleLecturer where id = ?";
		System.out.println("Deleted ProgramSemesterModuleLecturer with ID = " + id );
		return jdbcTemplateObject.update(SQL, new Object[] {id});
	}

	@Override
	public int updateProgramSemesterModuleLecturer(int id, int idProgramSemester, int idModuleLecturer) {
		String SQL = "update ProgramSemesterModuleLecturer set idProgramSemester = ?, idModuleLecturer = ? where id = ?";
		System.out.println("Updated ProgramSemester with ID = " + id + ", " + idProgramSemester + ", " + idModuleLecturer);
		return jdbcTemplateObject.update(SQL,  new Object[] {idProgramSemester, idModuleLecturer, id});
			
	}

}
