/*
 * Author:Mikhail
 * Initially designed by:Mikhail & Mariusz
 * */

package com.group3.interfaces;

public interface Student {


	public void addDeferral(int ID);
	public void deleteDeferral(int ID);
	
	
	public String getName();
	public void updateName(String name);
	
	public String getID() ;
	public void updateID(String iD) ;
	
	public Module getElective(int ID);
	public void updateElective(Module elective);
	public void addElective(Module elective);
	public void deleteElective(int ID);
	
	public ProgramSemester getProgramSemester(); 
	public void updateProgramSemester(ProgramSemester programSemester); 
	public void addProgramSemester(ProgramSemester programSemester); 
	public void deleteProgramSemester(int ID);

}
