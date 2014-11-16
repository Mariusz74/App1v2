
/**
 * @Author: Mikhail
 */
package com.group3.interfaces;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author Mikhail
 *
 */
public interface ProgramSemester {

	public Program getProgram() ;
	public void setProgram(Program program);

	public List<Semester> getSemesters();
	public void setSemesters(List<Semester> semesters);

	public int getYearNumber();
	public void setYearNumber(int yearNumber);

	public String getClassgroupName();
	public void setClassgroupName(String classgroupName) ;
	
	public List<Student> getStudents();
	public void setStudents(List<Student> students);
	
	public int getID();
	public void setID(int ID);
	
	
}
