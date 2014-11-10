
/**
 * @Author: Mikhail
 */
package com.group3;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.group3.domain.*;
import com.group3.interfaces.*;
import com.group3.interfaces.DAOStub.ProgramDAO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mikhail
 *
 */
public class ProgramCrudTest{
	private   ApplicationContext context;
	private   ProgramDAO programDAO;
	
	
	@Before
	public  void ProgramCrudTestInit()
	{		
		context=new ClassPathXmlApplicationContext("crudTestConfig.xml"); 
		//In-Memory DAO
		programDAO= (ProgramDAO)context.getBean("programDAO");
	}
	
	/*
	 * runTest will perform create,update,find and delete successfully
	 * All CRUD operation has to be run in a single method before 
	 * the dao is not persisted for some reason
	 * */
	@Test
	public void runTest()
	{
		createProgram();
		
		updateProgram();
		
		findProgram();
		
		deleteProgram();
		updateDeletedProgram();
	}
	
	
	//assert true if added to mock DB successfully
	public void createProgram() {
		ProgramImpl program=(ProgramImpl)context.getBean("programDCOM"); 
		assertTrue("new object added to mock db by dao",programDAO.create(program));
	}
	
	//assert true if object to be updated is found in repo and has been updated successfully.
	public void updateProgram() { 
		Program program=(Program)context.getBean("programDCOM"); 
		assertTrue(programDAO.update(program));
	}
	//assert false if object to be delete is not found in repo
	public void updateDeletedProgram() { 
		
		
		Program program=(Program)context.getBean("programDCOM"); 
		
		//assert true if created successfully
		assertFalse(programDAO.update(program));
		
		
	}
	//assert true if object to be delete is found in repo and has been deleted successfully.
	public void deleteProgram() {
		Program programToDelete=(Program)context.getBean("programDCOM"); 
		assertTrue(programDAO.delete(programToDelete.getID()));
	}
	//assert true if object to be found is found in repo and fetched successfully.
	public void findProgram() {
		Program foundProgram;
		Program programToFind;
	
		programToFind=(Program)context.getBean("programDCOM");
		foundProgram = programDAO.find(programToFind.getID());
		
		assertEquals(programToFind.getID(), foundProgram.getID());
	}
	

}
