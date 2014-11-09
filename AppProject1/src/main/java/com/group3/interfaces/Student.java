/*
 * Author:Mikhail
 * Initially designed by:Mikhail & Mariusz
 * */

package com.group3.interfaces;

public interface Student {


	public void addDeferral(Deferral deferral);
	public void deleteDeferral(int ID);
	
	
	public String getName();
	public void setName(String name);
	
	public String getID() ;
	public void setID(String iD) ;
	
	public Module getElective(int ID);
	public void setElective(Module elective);
	public void addElective(Module elective);
	public void deleteElective(int ID);
	
	public ProgramSemester getProgramSemester(); 
	public void setProgramSemester(ProgramSemester programSemester); 
	public void addProgramSemester(ProgramSemester programSemester); 
	public void deleteProgramSemester(int ID);

}
