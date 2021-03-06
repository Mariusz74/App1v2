// Mariusz S
package com.group3.jdbctemplate.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.group3.interfaces.Student;
import com.group3.jdbctemplate.dao.StudentDAO;

@Repository //mikhail:added repository stereotype
public class StudentJDBCTemplate implements StudentDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	// @Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(this.dataSource);
	}

	@Override
	public int createStudent(String firstname, String surname) {
		String SQL = "insert into Student (firstname, surname) values (?, ?)";
		return jdbcTemplateObject.update(SQL, new Object[] { firstname, surname});
		//System.out.println("Created Record Name = " + firstname + " " + surname);
		//return;	
	}

	@Override
	public int deleteStudent(Integer id) {
		String SQL = "delete from Student where id = ?";
		return jdbcTemplateObject.update(SQL, new Object[] {id});
		//System.out.println("Deleted Record with ID = " + id );
		//return;

	}

	@Override
	public int updateStudent(Integer id, String firstname, String surname,
							  String login, String password, String email, String address) {
		String SQL = "update Student set firstname = ?, surname = ?, login = ?, password = ?, email = ?, address = ? where id = ?";
		return jdbcTemplateObject.update(SQL,  new Object[] {firstname, surname, login, password, email, address, id});
		//System.out.println("Updated Record with ID = " + id );
		//return;	

	}

	@Override
	public int updateStudentProgramSemester(Integer id, Integer ProgramSemester) {
		String SQL = "update Student set ProgramSemester = ? where id = ?";
		return jdbcTemplateObject.update(SQL,  new Object[] {ProgramSemester, id});
		//System.out.println("Updated Record with ID = " + id );
		//return;	

	}

	/**@ Author: Mikhail
	 * Nov 17, 2014_9:17:41 AM
	 * Waiting for Donal to implement this
	 */
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**@ Author: Mikhail
	 * Nov 17, 2014_9:17:45 AM
	 * Waiting for Donal to implement this
	 */
	public Student find(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
