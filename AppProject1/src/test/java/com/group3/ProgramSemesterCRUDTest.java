
/**
 * @Author: Mikhail
 */
package com.group3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;

import com.group3.domain.ProgramSemesterImpl;
import com.group3.interfaces.DAOStub.ProgramDAO;
import com.group3.interfaces.DAOStub.ProgramSemesterDAO;


/**
 * @author Mikhail
 *
 */
public class ProgramSemesterCRUDTest {
	private ApplicationContext context;
	private ProgramSemesterDAO ProgramSemesterDAO;
	
	@Test
	public void CreateProgramSemester() {			
	ProgramSemesterImpl simpleBeanExample=(ProgramSemesterImpl)context.
              getBean("classGroup"); 
	
		System.out.println(simpleBeanExample.toString());
		
	}
	
}
