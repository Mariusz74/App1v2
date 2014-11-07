
/**
 * @Author: Mikhail
 */
package com.group3.domain;

import java.util.ArrayList;
import java.util.List;

import com.group3.interfaces.Program;
import com.group3.interfaces.AcademicTerm;

/**
 * @author Mikhail
 *
 */
public class ProgramSemesterImpl {
	Program program;
	AcademicTerm[] Semesters;
    int YearNumber;
	String ClassgroupName;
	List<Student> students;
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public ProgramSemesterImpl()
	{
		Semesters= new AcademicTerm[2];
		
	}
	
	public int getYearNumber() {
		return YearNumber;
	}
	public void setYearNumber(int yearNumber) {
		YearNumber = yearNumber;
	}
	public AcademicTerm[] getSemesters() {
		return Semesters;
	}
	public boolean setSemesters(AcademicTerm[] semesters) {
		Semesters = semesters;
		return true;
	}
	public void addSemester(AcademicTerm semester) {
		//TODO implement exception out of bound handler.
		
		
		//Semesters[Semesters.size] = semester;
	}

	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}

	public String getClassgroupName() {
		
		
		return ClassgroupName;
	}
	public void setClassgroupName(String classgroupName) {
		//TODO implement a validation logic to make sure classgroupname in the format of
		//ProramCode_Y1 e.g DCOM_1
		
		ClassgroupName = classgroupName;
	}
	
}
