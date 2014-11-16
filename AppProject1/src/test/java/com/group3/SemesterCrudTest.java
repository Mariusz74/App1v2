
/**
 * @Author: Mikhail
 */
package com.group3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.group3.domain.SemesterImpl;
import com.group3.domain.ProgramSemesterImpl;
import com.group3.domain.SemesterImpl;
import com.group3.interfaces.Semester;
import com.group3.interfaces.ProgramSemester;
import com.group3.test.interfaces.DAOStub.ProgramDAO;
import com.group3.test.interfaces.DAOStub.ProgramSemesterDAO;
import com.group3.test.interfaces.DAOStub.SemesterDAO;

/**
 * @author Mikhail
 *
 */
public class SemesterCrudTest {
	private   ApplicationContext context;
	private   SemesterDAO semesterDAO;
	
	@Before
	public  void ProgramCrudTestInit()
	{		
		context=new ClassPathXmlApplicationContext("crudTestConfig.xml"); 
		//In-Memory DAO
		semesterDAO= (SemesterDAO)context.getBean("semesterDAO");
	}
	@Test
	//assert true if added to mock DB successfully
	public void create() {
		SemesterImpl semester=(SemesterImpl)context.getBean("semester2"); 
		assertTrue("new object added to mock db by dao",semesterDAO.create(semester));
	}
	@Test
	//assert true if object to be updated is found in repo and has been updated successfully.
	public void update() { 
		Semester semester=(Semester)context.getBean("semester2"); 
		assertTrue(semesterDAO.update(semester));
	}
	@Test
	//assert false if object to be delete is not found in repo
	public void updateDeleted() { 
		
		
		Semester semester=(Semester)context.getBean("semester2"); 
		this.delete();
		//assert true if created successfully
		assertFalse(semesterDAO.update(semester));
	}
	@Test
	//assert true if object to be delete is found in repo and has been deleted successfully.
	public void delete() {
		Semester programToDelete=(Semester)context.getBean("semester2"); 
		assertTrue(semesterDAO.delete(programToDelete.getID()));
	}
	@Test
	//assert true if object to be found is found in repo and fetched successfully.
	public void find() {
		Semester found;
		Semester toFind;
	
		toFind=(Semester)context.getBean("semester2");
		found = semesterDAO.find(toFind.getID());
		
		assertEquals(toFind.getID(), found.getID());
	}
	


}
