
/**
 * @Author: Mikhail Nov 17, 2014_5:36:43 AM
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
import com.group3.domain.ProgramSemesterImpl;
import com.group3.interfaces.ProgramSemester;
import com.group3.jdbctemplate.dao.impl.ProgramSemesterJDBCTemplate;

/**
 * @author Mikhail
 *
 * Nov 17, 2014_5:36:43 AM
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:crudTestConfig.xml")
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,DbUnitTestExecutionListener.class })
public class ProgramSemesterCrudUnitTest {



		@Autowired
		ApplicationContext applicationContext2;
		
		@Autowired
		@Qualifier("programSemesterJdbcTemplate")
		ProgramSemesterJDBCTemplate JdbcTemplate;
		
		@Autowired
		@Qualifier("programSemesterTest")
		ProgramSemester object;
		
		ProgramSemester newObject;
		
		@Before
		public void init()
		{
			newObject=new ProgramSemesterImpl();
			newObject.setName("test");
		}
		
		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.CLEAN_INSERT)
		public void create() {
			//
			int affectedRows=JdbcTemplate.createProgramSemester(object.getProgram().getID(),object.getSemester().getID());	
			//fails if no rows affected
			assertNotEquals("creation failed",0, affectedRows);
		}
		
		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.CLEAN_INSERT)
		public void updateExistingRecord() {
			newObject.setID(1);
			int affectedRows=JdbcTemplate.updateProgramSemester(newObject.getID(),newObject.getName(),newObject.getCompulsoryModuleQuantity());	
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
			rowsAffected=JdbcTemplate.deleteProgramSemester(firstRecordID);
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
			
			rowsAffected=JdbcTemplate.updateProgramSemester(newObject.getID(),newObject.getName(),newObject.getCompulsoryModuleQuantity());	
			//fail if there is a record that has been updated
			assertEquals("Rows were updated", 0, rowsAffected);
		}
		
		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.DELETE_ALL)
		public void deleteNonexistentRecord()
		{
			int rowsAffected=0;
			rowsAffected=JdbcTemplate.deleteProgramSemester(1);
			//fail if there is record that has been deleted
			assertEquals("Rows deleted",0,rowsAffected);
		}

		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.CLEAN_INSERT)
		public void getAll()
		{
			List<ProgramSemester> objects;
			//there can't be an id of 0
			objects=JdbcTemplate.getAll();
			assertNotEquals("No rows fetched",0,objects.size());
		}
		
		@Test
		@DatabaseSetup(value="classpath:dataset.xml", type=DatabaseOperation.CLEAN_INSERT)
		public void find()
		{
			ProgramSemester object;
			object=JdbcTemplate.find(1);
			//fail if empty record
			assertNotNull(object);
		}
		
		
		
	}

