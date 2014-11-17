
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
	List<Semester> Semesters;
    int yearNumber;
	String classgroupName;
	List<Student> students;
	int ID;
	

	//TODO implement database access

	public ProgramSemesterImpl(){}
	
	public ProgramSemesterImpl(List<Semester> SemesterList, String classgroupName, int yearNumber, Program program)
	{
		this.Semesters= SemesterList;
		this.classgroupName=classgroupName;
		this.yearNumber=yearNumber;
		this.program=program;
		
	}

	

	public Program getProgram() {
		return program;
	}


	public void setProgram(Program program) {
		this.program = program;
	}


	public List<Semester> getSemesters() {
		return Semesters;
	}


	public void setSemesters(List<Semester> semesters) {
		Semesters = semesters;
	}


	public int getYearNumber() {
		return yearNumber;
	}


	public void setYearNumber(int yearNumber) {
		this.yearNumber = yearNumber;
	}


	public String getClassgroupName() {
		return classgroupName;
	}


	public void setClassgroupName(String classgroupName) {
		this.classgroupName = classgroupName;
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
