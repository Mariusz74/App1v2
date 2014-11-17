
/**
 * @Author: Mikhail Nov 17, 2014_9:08:14 AM
 */
package com.group3.test.dbUnitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.group3.domain.StudentImpl;
import com.group3.interfaces.Student;
import com.group3.jdbctemplate.dao.impl.StudentJDBCTemplate;

/**
 * @author Mikhail
 *
 * Nov 17, 2014_9:08:14 AM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:crudTestConfig.xml")
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,DbUnitTestExecutionListener.class })
public class StudentCrudUnitTest {



		@Autowired
		ApplicationContext applicationContext2;
		
		@Autowired
		@Qualifier("studentJdbcTemplate")
		StudentJDBCTemplate JdbcTemplate;
		
		@Autowired
		@Qualifier("studentTest")
		StudentImpl object;
		
		Student newObject;
		
		@Before
		public void init()
		{
			newObject=new StudentImpl();
			newObject.setFirstName("fname");
			newObject.setSurName("sname");
		}
		
		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.CLEAN_INSERT)
		public void create() {
			
			int affectedRows=JdbcTemplate.createStudent(object.getFirstName(),object.getSurName());	
			//fails if no rows affected
			assertNotEquals("creation failed",0, affectedRows);
		}
		
		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.CLEAN_INSERT)
		public void updateExistingRecord() {
			newObject.setID(1);
			int affectedRows=JdbcTemplate.updateStudent(newObject.getID(),newObject.getFirstName(),newObject.getSurName(),
					newObject.getLogin(),newObject.getPassword(),newObject.getEmail(),newObject.getAddress()
					);	
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
			rowsAffected=JdbcTemplate.deleteStudent(firstRecordID);
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
			rowsAffected=JdbcTemplate.updateStudent(newObject.getID(),newObject.getFirstName(),newObject.getSurName(),
					newObject.getLogin(),newObject.getPassword(),newObject.getEmail(),newObject.getAddress()
					);	
			//fail if there is a record that has been updated
			assertEquals("Rows were updated", 0, rowsAffected);
		}
		
		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.DELETE_ALL)
		public void deleteNonexistentRecord()
		{
			int rowsAffected=0;
			rowsAffected=JdbcTemplate.deleteStudent(1);
			//fail if there is record that has been deleted
			assertEquals("Rows deleted",0,rowsAffected);
		}

		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.CLEAN_INSERT)
		public void getAll()
		{
			//mikhail-11/17/2014:test will fail because there are still unimplemented methods
			List<Student> objects;
			//there can't be an id of 0
			objects=JdbcTemplate.getAll();
			assertNotEquals("No rows fetched",0,objects.size());
		}
		
		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.CLEAN_INSERT)
		public void find()
		{
			//mikhail-11/17/2014:test will fail because there are still unimplemented methods
			Student object;
			object=JdbcTemplate.find(1);
			//fail if empty record
			assertNotNull(object);
		}
		
		
		
	}