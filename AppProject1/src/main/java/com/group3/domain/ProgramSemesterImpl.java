
/**
 * @Author: Mikhail
 */
package com.group3.domain;


import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import com.group3.interfaces.Program;
import com.group3.interfaces.Semester;
import com.group3.interfaces.ProgramSemester;
import com.group3.interfaces.Student;

/**
 * @author Mikhail
 *
 */
public class ProgramSemesterImpl implements ProgramSemester{
	
	
	Program program;
	//List<Semester> Semesters;
	Semester Semester;
  	int CompulsoryModuleQuantity;
	String name;
	List<Student> students;
	int ID;
	

	//TODO implement database access

	public ProgramSemesterImpl(){}
	
	public ProgramSemesterImpl(Semester Semester, String classgroupName, int CompulsoryModuleQuantity, Program program)
	{
		this.Semester= Semester;
		this.name=classgroupName;
		this.CompulsoryModuleQuantity=CompulsoryModuleQuantity;
		this.program=program;
		
	}

	

	public Program getProgram() {
		return program;
	}


	public void setProgram(Program program) {
		this.program = program;
	}


	public Semester getSemester() {
		return Semester;
	}


	public void setSemester(Semester Semester) {
		this.Semester = Semester;
	}


	public int getCompulsoryModuleQuantity() {
		return CompulsoryModuleQuantity;
	}


	public void setCompulsoryModuleQuantity(int CompulsoryModuleQuantity) {
		this.CompulsoryModuleQuantity = CompulsoryModuleQuantity;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}


	public int getID() {
		return ID;
	}

	@Override
	public void setID(int iD) {
		ID = iD;
	}

	

	
	
}
