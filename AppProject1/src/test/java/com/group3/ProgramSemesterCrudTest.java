
/**
 * @Author: Mikhail
 */
package com.group3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.group3.domain.ProgramSemesterImpl;
import com.group3.interfaces.ProgramSemester;
import com.group3.interfaces.DAOStub.ProgramSemesterDAO;



/**
 * @author Mikhail
 *
 */
public class ProgramSemesterCrudTest {
	private ApplicationContext context;
	private ProgramSemesterDAO ProgramSemesterDAO;

		
	@Before
	public  void ProgramCrudTestInit()
	{		
		context=new ClassPathXmlApplicationContext("crudTestConfig.xml"); 
		//In-Memory DAO
		ProgramSemesterDAO= (ProgramSemesterDAO)context.getBean("programSemesterDAO");
	}
	
	/*
	 * runTest will perform create,update,find and delete successfully
	 * All CRUD operation has to be run in a single method before 
	 * the dao is not persisted for some reason
	 * */
	@Test
	public void runTest()
	{
		create();
		
		update();
		
		find();
		
		delete();
	}
	
	
	//assert true if added to mock DB successfully
	public void create() {
		ProgramSemester programSemester=(ProgramSemester)context.getBean("classGroupDCOM"); 
		assertTrue("new object added to mock db by dao",ProgramSemesterDAO.create(programSemester));
	}
	
	
	public void update() { 
		ProgramSemester programSemester=(ProgramSemester)context.getBean("classGroupDCOM"); 
		//assert true if created successfully
		assertTrue(ProgramSemesterDAO.update(programSemester));
	}
	
	public void delete() {
		ProgramSemester programToDelete=(ProgramSemester)context.getBean("classGroupDCOM"); 
		assertTrue(ProgramSemesterDAO.delete(programToDelete.getID()));
	}
	
	public void find() {
		ProgramSemester found;
		ProgramSemester toFind;
	
		toFind=(ProgramSemester)context.getBean("classGroupDCOM");
		found = ProgramSemesterDAO.find(toFind.getID());
		
		assertEquals(toFind.getID(), found.getID());
	}
	

}
