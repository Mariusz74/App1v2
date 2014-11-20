
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
	
	int ID;	
	String name;
	Program program;	
	int idProgram;
	Semester Semester;
	int idSemester;	
	//List<Semester> Semesters;
  	int CompulsoryModuleQuantity;
	List<Student> students;

	public ProgramSemesterImpl(){}
	
	public ProgramSemesterImpl(Semester Semester, String classgroupName, int CompulsoryModuleQuantity, Program program)
	{
		this.Semester= Semester;
		this.name=classgroupName;
		this.CompulsoryModuleQuantity=CompulsoryModuleQuantity;
		this.program=program;
		
	}

	@Override	
	public int getidProgram() {
		return idProgram;
	}
	@Override
	public void setidProgram(int idProgram) {
		this.idProgram = idProgram;
	}
	@Override
	public int getidSemester() {
		return idSemester;
	}
	@Override
	public void setidSemester(int idSemester) {
		this.idSemester = idSemester;
	}
	@Override
	public Program getProgram() {
		return program;
	}

	@Override
	public void setProgram(Program program) {
		this.program = program;
	}

	@Override
	public Semester getSemester() {
		return Semester;
	}

	@Override
	public void setSemester(Semester Semester) {
		this.Semester = Semester;
	}

	@Override
	public int getCompulsoryModuleQuantity() {
		return CompulsoryModuleQuantity;
	}

	@Override
	public void setCompulsoryModuleQuantity(int CompulsoryModuleQuantity) {
		this.CompulsoryModuleQuantity = CompulsoryModuleQuantity;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public List<Student> getStudents() {
		return students;
	}

	@Override
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public int getID() {
		return ID;
	}

	@Override
	public void setID(int iD) {
		ID = iD;
	}

	

	
	
}
