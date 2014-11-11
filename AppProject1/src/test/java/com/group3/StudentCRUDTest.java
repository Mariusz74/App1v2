
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

import com.group3.domain.StudentImpl;
import com.group3.interfaces.Student;
import com.group3.interfaces.DAOStub.StudentDAO;

/**
 * @author Mikhail
 *
 */
public class StudentCRUDTest {
	private   ApplicationContext context;
	private   StudentDAO studentDAO;
	
	@Before
	public  void ProgramCrudTestInit()
	{		
		context=new ClassPathXmlApplicationContext("crudTestConfig.xml"); 
		//In-Memory DAO
		studentDAO= (StudentDAO)context.getBean("studentDAO");
	}
	@Test
	//assert true if added to mock DB successfully
	public void create() {
		StudentImpl student=(StudentImpl)context.getBean("semester2"); 
		assertTrue("new object added to mock db by dao",studentDAO.create(student));
	}
	@Test
	//assert true if object to be updated is found in repo and has been updated successfully.
	public void update() { 
		Student student=(Student)context.getBean("semester2"); 
		assertTrue(studentDAO.update(student));
	}
	@Test
	//assert false if object to be delete is not found in repo
	public void updateDeleted() { 
		
		
		Student student=(Student)context.getBean("semester2"); 
		this.delete();
		//assert true if created successfully
		assertFalse(studentDAO.update(student));
	}
	@Test
	//assert true if object to be delete is found in repo and has been deleted successfully.
	public void delete() {
		Student programToDelete=(Student)context.getBean("semester2"); 
		assertTrue(studentDAO.delete(programToDelete.getID()));
	}
	@Test
	//assert true if object to be found is found in repo and fetched successfully.
	public void find() {
		Student found;
		Student toFind;
	
		toFind=(Student)context.getBean("semester2");
		found = studentDAO.find(toFind.getID());
		
		assertEquals(toFind.getID(), found.getID());
	}
	
}
