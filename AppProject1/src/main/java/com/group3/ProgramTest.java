
/**
 * @Author: Mikhail
 */
package com.group3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

import com.group3.domain.ProgramImpl;
import com.group3.domain.ProgramSemesterImpl;
import com.group3.domain.Semester;
import com.group3.interfaces.Program;
import com.group3.interfaces.ProgramSemester;
import com.group3.interfaces.AcademicTerm;

import junit.framework.TestCase;

/**
 * @author Mikhail
 *
 */
public class ProgramTest extends TestCase {
	
	Program program;
	AcademicTerm sem;
	ProgramSemester progSem;
	List<ProgramSemester> progsemList;
	@Before 
	public void initialise()
	{
		//program = (Program) new ProgramImpl();
		sem = (AcademicTerm) new Semester();
		progSem = (ProgramSemester) new ProgramSemesterImpl();
		progsemList=new ArrayList<ProgramSemester>();
	}
	
	
	public void test()
	{
		
	}
	public void addSemesterToProgramSemester(AcademicTerm semester)
	{
		
		
	}
	public void createProgram(AcademicTerm semester)
	{
		
		
	}
}
