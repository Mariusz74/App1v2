
/**
 * @Author: Mikhail Nov 16, 2014_11:51:07 AM
 */
package com.group3.dbIntegrationTest.crudOperation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import org.springframework.dao.EmptyResultDataAccessException;

import com.group3.domain.LecturerImpl;
import com.group3.domain.ProgramImpl;
import com.group3.interfaces.Lecturer;
import com.group3.interfaces.Program;
import com.group3.jdbctemplate.dao.impl.LecturerJDBCTemplate;
import com.group3.jdbctemplate.dao.impl.ProgramJDBCTemplate;
import com.group3.jdbctemplate.dao.impl.SemesterJDBCTemplate;

/**
 * @author Mikhail
 *
 * Nov 16, 2014_11:51:07 AM
 */
public class ProgramCrudTest {

	
	private ApplicationContext context;
	ProgramJDBCTemplate jdbcTemplate;
	
	ProgramImpl testObject;
	@Before
	public void initialize()
	{
		context=new ClassPathXmlApplicationContext ("crudTestConfig.xml"); 
		jdbcTemplate=(ProgramJDBCTemplate)context.getBean("programJdbcTemplate");		
		
		//used for inserting to database
		testObject=(ProgramImpl)context.getBean("programTest");
	}
	
	@Test
	public void testCrud()
	{
		//note: see note 4 in Notes.txt for details
		create();
		updateExistingRow();
		find();
		getAll();
		delete();
		this.deleteNonexistentRecord();
		this.updateNonexistentRecord();
	}
	

	//@Test(expected=EmptyResultDataAccessException.class)
	public void findNonexistentRecord()
	{
		Program obj;
		//simulate deleted record
		int deletedRecId=getLastInsertedID()+5;
		
		obj=jdbcTemplate.find(deletedRecId);
		//fail if there is no record that has been deleted	
		assertNull(obj);
	}
	
	
	private void create()
	{
		//
		int affectedRows=jdbcTemplate.createProgram(testObject.getName());	
		//fails if no rows affected
		assertNotEquals("creation failed",0, affectedRows);
	}
	
	private void updateExistingRow()
	{
		
		int lastInserted=getLastInsertedID();
		//assumes the last inserted id was the record this test class created
		testObject.setID(lastInserted);
	
		int rowsAffected=0;	
		rowsAffected=jdbcTemplate.updateProgram(testObject.getID(),testObject.getName());
		assertNotEquals("No rows updated",0,rowsAffected);
	}
	
	private void delete()
	{
		int lastInserted=getLastInsertedID();
		int rowsAffected=0;
		rowsAffected=jdbcTemplate.deleteProgram(lastInserted);
		//fail if there is no record that has been deleted
		assertNotEquals("No rows delete",0,rowsAffected);
	}

	private void updateNonexistentRecord()
	{
		int lastInserted=getLastInsertedID();
		
		//simulates a deleted record
		LecturerImpl newLect=new LecturerImpl();
		newLect.setID(lastInserted+5);
		
		int rowsAffected=0;
		
		rowsAffected=jdbcTemplate.updateProgram(testObject.getID(),testObject.getName());
		//fail if there is a record that has been updated
		assertEquals("Rows were updated", 0, rowsAffected);
	}
	
	private void deleteNonexistentRecord()
	{
		
		int lastInserted=getLastInsertedID();
		//simulates a deleted record
		int nonExitantRecordId=lastInserted+5;
		
		
		int rowsAffected=0;
		rowsAffected=jdbcTemplate.deleteProgram(nonExitantRecordId);
		//fail if there is record that has been deleted
		assertEquals("Rows deleted",0,rowsAffected);
	}

	//Author:mikhail
	private void getAll()
	{
		List<Program> objs;
		//there can't be an id of 0
		objs=jdbcTemplate.getAll();
		assertNotEquals("No rows fetched",0,objs.size());
	}
	//Author:mikhail
	private void find()
	{
		Program obj;
		obj=jdbcTemplate.find(getLastInsertedID());
		//fail if empty record
		assertNotNull(obj);
	}
	
	
	private int getLastInsertedID()
	{
		//helper method.
		List<Program> objs=jdbcTemplate.getAll();
		try{
			if(objs.size()!=0  )
			{
				return objs.get(objs.size()-1).getID();
			}
			else
				return 0;	
		}
		catch(NullPointerException ex)
		{
			return 0;
		}
	}
}
