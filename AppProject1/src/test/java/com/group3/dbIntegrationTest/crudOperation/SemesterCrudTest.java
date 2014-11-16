
/**
 * @Author: Mikhail Nov 16, 2014_6:09:20 PM
 */
package com.group3.dbIntegrationTest.crudOperation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.group3.domain.Lecturer;
import com.group3.interfaces.Semester;
import com.group3.jdbctemplate.dao.impl.LecturerJDBCTemplate;
import com.group3.jdbctemplate.dao.impl.SemesterJDBCTemplate;

/**
 * @author Mikhail
 *
 * Nov 16, 2014_6:09:20 PM
 */
public class SemesterCrudTest {

	private ApplicationContext context;
	SemesterJDBCTemplate semesterJdbcTemplate;
	
	Semester testObject;
	@Before
	public void initialize()
	{
		context=new ClassPathXmlApplicationContext ("crudTestConfig.xml"); 
		semesterJdbcTemplate=(SemesterJDBCTemplate)context.getBean("semesterJdbcTemplate");		
		
		//used for inserting to database
		testObject=(Semester)context.getBean("semesterTest");
	}
	
	@Test
	public void testCrud()
	{
		//note: see note 4 in Notes.txt for details
		create();
		updateExistingRow();
		find();
		delete();
		this.deleteNonexistentRecord();
		this.updateNonexistentRecord();
		getAll();
		
		
	
	}
	

	//@Test(expected=EmptyResultDataAccessException.class)
	public void findNonexistentRecord()
	{
		Semester obj;
		//simulate deleted record
		int deletedRecId=getLastInsertedID()+5;
		
		obj=semesterJdbcTemplate.find(deletedRecId);
		//fail if there is no record that has been deleted	
		assertNull(obj);
	}
	
	
	private void create()
	{
		//
		int affectedRows=semesterJdbcTemplate.createSemester(testObject.getName());	
		//fails if no rows affected
		assertNotEquals("creation failed",0, affectedRows);
	}
	
	private void updateExistingRow()
	{
		
		int lastInserted=getLastInsertedID();
		//assumes the last inserted id was the record this test class created
		testObject.setID(lastInserted);
	
		int rowsAffected=0;	
		rowsAffected=semesterJdbcTemplate.updateSemester(testObject.getID(),testObject.getName());
		assertNotEquals("No rows updated",0,rowsAffected);
	}
	
	private void delete()
	{
		int lastInserted=getLastInsertedID();
		int rowsAffected=0;
		rowsAffected=semesterJdbcTemplate.deleteSemester(lastInserted);
		//fail if there is no record that has been deleted
		assertNotEquals("No rows delete",0,rowsAffected);
	}

	private void updateNonexistentRecord()
	{
		int lastInserted=getLastInsertedID();
		
		//simulates a deleted record
		Lecturer newLect=new Lecturer();
		newLect.setID(lastInserted+5);
		
		int rowsAffected=0;
		
		rowsAffected=semesterJdbcTemplate.updateSemester(testObject.getID(),testObject.getName());
		//fail if there is a record that has been updated
		assertEquals("Rows were updated", 0, rowsAffected);
	}
	
	private void deleteNonexistentRecord()
	{
		
		int lastInserted=getLastInsertedID();
		//simulates a deleted record
		int nonExitantRecordId=lastInserted+5;
		
		
		int rowsAffected=0;
		rowsAffected=semesterJdbcTemplate.deleteSemester(nonExitantRecordId);
		//fail if there is record that has been deleted
		assertEquals("Rows deleted",0,rowsAffected);
	}

	private void getAll()
	{
		List<Semester> objs;
		//there can't be an id of 0
		objs=semesterJdbcTemplate.getAll();
		assertNotEquals("No rows fetched",0,objs.size());
	}
	
	private void find()
	{
		Semester obj;
		obj=semesterJdbcTemplate.find(getLastInsertedID());
		//fail if empty record
		assertNotNull(obj);
	}
	
	
	private int getLastInsertedID()
	{
		//helper method.
		List<Semester> objs=semesterJdbcTemplate.getAll();
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