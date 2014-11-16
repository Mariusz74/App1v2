
/**
 * @Author: Mikhail Nov 16, 2014_3:26:03 PM
 */
package com.group3.dbIntegrationTest.crudOperation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import junit.framework.Assert;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import com.group3.interfaces.Lecturer;
import com.group3.domain.LecturerImpl;
import com.group3.jdbctemplate.dao.impl.LecturerJDBCTemplate;

/**
 * @author Mikhail
 *
 * Nov 16, 2014_3:26:03 PM
 */
public class lecturerCrudTest {
	private ApplicationContext context;
	LecturerJDBCTemplate lecturerJdbcTemplate;
	
	Lecturer testLecturer;
	@Before
	public void initialize()
	{
		context=new ClassPathXmlApplicationContext ("crudTestConfig.xml"); 
		lecturerJdbcTemplate=(LecturerJDBCTemplate)context.getBean("lecturerJdbcTemplate");		
		
		//used for inserting to database
		testLecturer=(Lecturer)context.getBean("lecturerTest");
	}
	
	@Test
	public void testCrud()
	{
		//note: see note 4 in Notes.txt for details
		create();
		updateExistingRow();
		getAll();
		find();
		delete();
		this.deleteNonexistentRecord();
		this.updateNonexistentRecord();
		
	}
	

	@Test(expected=EmptyResultDataAccessException.class)
	public void findNonexistentRecord()
	{
		Lecturer lecturer;
		//simulate deleted record
		int deletedRecId=getLastInsertedID()+5;
		
		lecturer=lecturerJdbcTemplate.find(deletedRecId);
		//fail if there is no record that has been deleted	
		assertNull(lecturer);
	}
	
	
	private void create()
	{
		//
		int affectedRows=lecturerJdbcTemplate.create(testLecturer);	
		//fails if no rows affected
		assertNotEquals("creation failed",0, affectedRows);
	}
	
	private void updateExistingRow()
	{
		
		int lastInserted=getLastInsertedID();
		//assumes the last inserted id was the record this test class created
		testLecturer.setID(lastInserted);
	
		int rowsAffected=0;	
		rowsAffected=lecturerJdbcTemplate.update(testLecturer);
		assertNotEquals("No rows updated",0,rowsAffected);
	}
	
	private void delete()
	{
		int lastInserted=getLastInsertedID();
		int rowsAffected=0;
		rowsAffected=lecturerJdbcTemplate.delete(lastInserted);
		//fail if there is no record that has been deleted
		assertNotEquals("No rows delete",0,rowsAffected);
	}

	private void updateNonexistentRecord()
	{
		int lastInserted=getLastInsertedID();
		
		//simulates a deleted record
		Lecturer newLect=new LecturerImpl();
		newLect.setID(lastInserted+5);
		
		int rowsAffected=0;
		
		rowsAffected=(lecturerJdbcTemplate.update(testLecturer));
		//fail if there is a record that has been updated
		assertEquals("Rows were updated", 0, rowsAffected);
	}
	
	private void deleteNonexistentRecord()
	{
		
		int lastInserted=getLastInsertedID();
		//simulates a deleted record
		int nonExitantRecordId=lastInserted+5;
		
		
		int rowsAffected=0;
		rowsAffected=lecturerJdbcTemplate.delete(nonExitantRecordId);
		//fail if there is record that has been deleted
		assertEquals("Rows deleted",0,rowsAffected);
	}

	private void getAll()
	{
		List<Lecturer> lecturers;
		//there can't be an id of 0
		lecturers=lecturerJdbcTemplate.getAll();
		assertNotEquals("No rows fetched",0,lecturers.size());
	}
	
	private void find()
	{
		Lecturer lecturer;
		lecturer=lecturerJdbcTemplate.find(getLastInsertedID());
		//fail if empty record
		assertNotNull(lecturer);
	}
	
	
	private int getLastInsertedID()
	{
		//helper method.
		List<Lecturer> objs=lecturerJdbcTemplate.getAll();
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
