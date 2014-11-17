
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

	public int getidProgram();
	public void setidProgram(int idProgram);

	public int getidSemester();
	public void setidSemester(int idSemester);
	public Program getProgram() ;
	public void setProgram(Program program);

	public Semester getSemester();
	public void setSemester(Semester Semester);


	public String getName();
	public void setName(String name) ;
	
	public List<Student> getStudents();
	public void setStudents(List<Student> students);
	
	public int getID();
	public void setID(int ID);
	
	public int getCompulsoryModuleQuantity();

	public void setCompulsoryModuleQuantity(int CompulsoryModuleQuantity);
}
