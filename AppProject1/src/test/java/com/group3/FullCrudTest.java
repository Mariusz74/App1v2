
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

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mikhail
 *
 */
public class FullCrudTest extends TestCase{
	private ApplicationContext context;
//	private List<Program> programs;
	private ProgramDAO programDAO;
	public FullCrudTest()
	{		
		context=new ClassPathXmlApplicationContext("FullCrudTestConfiguration.xml"); 
		programDAO= (ProgramDAO)context.getBean("programDAO");
	}
	
	
	@Test
	public void CreateProgram() {
		Program program=(Program)context.getBean("createProgram"); 
		
		programDAO.create(program);
	}
	
	@Test
	public void updateProgram() { 
		Program program=(Program)context.getBean("updateProgram"); 
		programDAO.update(program);
	}
	@Test
	public void deleteProgram() {
		int ID=(int)context.getBean("deleteProgram"); 
		programDAO.delete(ID);
		
	}
	@Test
	public void findProgram() {
		Program foundProgram;
		int ID=(int)context.getBean("deleteProgram"); 
		foundProgram = programDAO.find(ID);
	}
	

}
