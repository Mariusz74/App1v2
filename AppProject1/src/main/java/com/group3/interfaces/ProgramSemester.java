
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

	public List<Student> getStudents();
	public void updateStudents(List<Student> students);
	public void deleteStudent(int ID);
	
	public int getYearNumber();
	public void updateYearNumber(int yearNumber);
	
	@Required
	public boolean updateSemesters(List<Semester> semesters);
	public void addSemester(Semester semester);
	public void deleteSemester(int id);
	public List<Semester>  getSemesters();
	
	
	public Program getProgram();
	@Required
	public void updateProgram(Program program);
	public void deleteProgram(int ID);
	
	public String getClassgroupName();
	@Required
	public void setClassgroupName(String classgroupName) ;
	
	public int getID();
	public void setID(int ID) ;
	
	
}
