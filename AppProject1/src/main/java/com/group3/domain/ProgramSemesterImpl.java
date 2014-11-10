
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

	public ProgramSemesterImpl(List<Semester> SemesterList, String classgroupName, int yearNumber, Program program)
	{
		this.Semesters= SemesterList;
		this.classgroupName=classgroupName;
		this.yearNumber=yearNumber;
		this.program=program;
		
	}
	
	
	@Required
	public void setClassgroupName(String classgroupName) {
		//TODO implement a validation logic to make sure classgroupName in the format of
		//ProramCode_Y1 e.g DCOM_1
		
		this.classgroupName = classgroupName;
	}


	/* (non-Javadoc)
	 * @see com.group3.interfaces.ProgramSemester#setStudents(java.util.List)
	 */
	@Override
	public void setStudents(List<Student> students) {
		// TODO Auto-generated method stub
		
	}



	/* (non-Javadoc)
	 * @see com.group3.interfaces.ProgramSemester#deleteStudent(int)
	 */
	@Override
	public void deleteStudent(int ID) {
		// TODO Auto-generated method stub
		
	}



	/* (non-Javadoc)
	 * @see com.group3.interfaces.ProgramSemester#setYearNumber(int)
	 */
	@Override
	public void setYearNumber(int yearNumber) {
		// TODO Auto-generated method stub
		
	}



	/* (non-Javadoc)
	 * @see com.group3.interfaces.ProgramSemester#setSemesters(java.util.List)
	 */
	@Override
	public boolean setSemesters(List<Semester> semesters) {
		// TODO Auto-generated method stub
		return false;
	}



	/* (non-Javadoc)
	 * @see com.group3.interfaces.ProgramSemester#setProgram(com.group3.interfaces.Program)
	 */
	@Override
	public void setProgram(Program program) {
		// TODO Auto-generated method stub
		
	}



	/* (non-Javadoc)
	 * @see com.group3.interfaces.ProgramSemester#deleteProgram(int)
	 */
	@Override
	public void deleteProgram(int ID) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString()
	{
	 return	"ID " + this.getID() + "groupName: " + classgroupName + "Year: " + yearNumber;	
	}


	/* (non-Javadoc)
	 * @see com.group3.interfaces.ProgramSemester#getStudents()
	 */
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}


	/* (non-Javadoc)
	 * @see com.group3.interfaces.ProgramSemester#getYearNumber()
	 */
	@Override
	public int getYearNumber() {
		// TODO Auto-generated method stub
		return 0;
	}


	/* (non-Javadoc)
	 * @see com.group3.interfaces.ProgramSemester#addSemester(com.group3.interfaces.Semester)
	 */
	@Override
	public void addSemester(Semester semester) {
		// TODO Auto-generated method stub
		
	}


	/* (non-Javadoc)
	 * @see com.group3.interfaces.ProgramSemester#deleteSemester(int)
	 */
	@Override
	public void deleteSemester(int id) {
		// TODO Auto-generated method stub
		
	}


	/* (non-Javadoc)
	 * @see com.group3.interfaces.ProgramSemester#getSemesters()
	 */
	@Override
	public List<Semester> getSemesters() {
		// TODO Auto-generated method stub
		return null;
	}


	/* (non-Javadoc)
	 * @see com.group3.interfaces.ProgramSemester#getProgram()
	 */
	@Override
	public Program getProgram() {
		// TODO Auto-generated method stub
		return null;
	}


	/* (non-Javadoc)
	 * @see com.group3.interfaces.ProgramSemester#getClassgroupName()
	 */
	@Override
	public String getClassgroupName() {
		// TODO Auto-generated method stub
		return null;
	}


	/* (non-Javadoc)
	 * @see com.group3.interfaces.ProgramSemester#getID()
	 */
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}


	/* (non-Javadoc)
	 * @see com.group3.interfaces.ProgramSemester#setID(int)
	 */
	@Override
	public void setID(int ID) {
		// TODO Auto-generated method stub
		
	}


	
}
