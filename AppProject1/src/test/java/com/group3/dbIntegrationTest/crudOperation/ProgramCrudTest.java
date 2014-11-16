
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

import com.group3.domain.Lecturer;
import com.group3.interfaces.Semester;
import com.group3.jdbctemplate.dao.impl.LecturerJDBCTemplate;
import com.group3.jdbctemplate.dao.impl.ProgramJDBCTemplate;

/**
 * @author Mikhail
 *
 * Nov 16, 2014_11:51:07 AM
 */
public class ProgramCrudTest {

	
	private ApplicationContext context;
	ProgramJDBCTemplate programJdbcTemplate;
	@Before
	public void initialize()
	{
		context=new ClassPathXmlApplicationContext
                ("crudTestConfig.xml"); 
		programJdbcTemplate=(ProgramJDBCTemplate)context.getBean("programJdbcTemplate");
		
	}
	
	@Test
	public void testCrud()
	{
		create();
		//updateExistingRow();
		//delete();
		//this.deleteNonExistingRecord();
		//this.updateNonExistingRecord();
	}
	
	public void create()
	{
		//
		programJdbcTemplate.createProgram("testProgram");	
	}
	
	public void updateExistingRow()
	{
		//create method is assumed to have been run at this point so there is at least 1 program with id =1
		int rowsAffected=0;
		//id of 1 is only a placeholder until a mapper is implemented that will get an existing id
		rowsAffected=programJdbcTemplate.updateProgram(1, "testme");
		assertNotEquals("No rows updated",0,rowsAffected);
	}
	
	public void delete()
	{
		int rowsAffected=0;
		rowsAffected=programJdbcTemplate.deleteProgram(1);
		//fail if there is no record that has been deleted
		assertNotEquals("No rows delete",0,rowsAffected);
	}

	public void updateNonExistingRecord()
	{
		int rowsAffected=0;
		//there can't be an id of 0
		rowsAffected=(programJdbcTemplate.updateProgram(0, "testme"));
		//fail if there is a record that has been updated
		assertEquals("Rows were affected", 0, rowsAffected);
	}
	
	public void deleteNonExistingRecord()
	{
		int rowsAffected=0;
		//there can't be an id of 0
		rowsAffected=programJdbcTemplate.deleteProgram(0);
		//fail if there is no record that has been deleted
		assertEquals("No rows affected",0,rowsAffected);
	}


	private int getLastInsertedID()
	{
		//helper method.
		/*List<Semester> lects=programJdbcTemplate.getAll();
		try{
			if(lects.size()!=0  )
			{
				return lects.get(lects.size()-1).getID();
			}
			else
				return 0;	
		}
		catch(NullPointerException ex)
		{
			return 0;
		}*/
		return 0;
	}
	
}
