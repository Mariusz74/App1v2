package com.group3.test.dbUnitTests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.group3.domain.LecturerImpl;
import com.group3.domain.ProgramSemesterModuleLecturerImpl;
import com.group3.interfaces.Lecturer;
import com.group3.interfaces.ProgramSemesterModuleLecturer;
import com.group3.jdbctemplate.dao.impl.LecturerJDBCTemplate;
import com.group3.jdbctemplate.dao.impl.ProgramSemesterModuleLecturerJDBCTemplate;



	
	@ContextConfiguration("classpath:crudTestConfig.xml")
	@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,DbUnitTestExecutionListener.class })

	public class ProgramSemesterModuleLecturerCrudUnitTest {
		@Autowired
		ApplicationContext applicationContext2;
		
		@Autowired
		@Qualifier("1")
		ProgramSemesterModuleLecturerJDBCTemplate JdbcTemplate;
		
		@Autowired
		@Qualifier("2")
		ProgramSemesterModuleLecturerImpl object;
		
		ProgramSemesterModuleLecturer newObject=new ProgramSemesterModuleLecturerImpl();
		
		public void before()
		{
			//autowiring is not workin?
			object=new ProgramSemesterModuleLecturerImpl();
			object.setIdProgramSemester(2);
			object.setIdModuleLecturer(2);
		}
		@Test
		//@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.CLEAN_INSERT)
		public void testCreate() {
			//
			
			assertNotNull(null);
			int affectedRows=JdbcTemplate.createProgramSemesterModuleLecturer(1,2);	
			//fails if no rows affected
			//assertNotEquals("creation failed",0, affectedRows);
		}
		/*
		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.CLEAN_INSERT)
		public void updateExistingRecord() {
			newObject.setID(1);
			int affectedRows=JdbcTemplate.update(newObject);	
			//fails if no rows affected
			assertNotEquals("creation failed",0, affectedRows);
		}
		
		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.CLEAN_INSERT)	
		public void delete()
		{
			//in the dataset, the first record has id of 1
			int firstRecordID=1;
			int rowsAffected=0;
			rowsAffected=JdbcTemplate.delete(firstRecordID);
			//fail if there is no record that has been deleted
			assertNotEquals("No rows delete",0,rowsAffected);
		}

		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.DELETE_ALL)
		public void updateNonexistentRecord()
		{
			//simulates a deleted record
			
			newObject.setID(1);
			int rowsAffected=0;
			
			rowsAffected=(JdbcTemplate.update(newObject));
			//fail if there is a record that has been updated
			assertEquals("Rows were updated", 0, rowsAffected);
		}
		
		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.DELETE_ALL)
		public void deleteNonexistentRecord()
		{
			int rowsAffected=0;
			rowsAffected=JdbcTemplate.delete(1);
			//fail if there is record that has been deleted
			assertEquals("Rows deleted",0,rowsAffected);
		}

		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.CLEAN_INSERT)
		public void getAll()
		{
			List<ProgramSemesterModuleLecturer> objects;
			//there can't be an id of 0
			objects=JdbcTemplate.getAll();
			assertNotEquals("No rows fetched",0,objects.size());
		}
		
		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.CLEAN_INSERT)
		public void find()
		{
			ProgramSemesterModuleLecturer object;
			object=JdbcTemplate.find(1);
			//fail if empty record
			assertNotNull(object);
		}
	*/
}