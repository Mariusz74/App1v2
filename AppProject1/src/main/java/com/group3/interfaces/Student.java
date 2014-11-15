/*
 * Author:Mikhail
 * Initially designed by:Mikhail & Mariusz
 * */

package com.group3.interfaces;

public interface Student {

	public int getID() ;
	public void setID(int iD) ;
	
	public String getFirstName();
	public void setFirstName(String firstName);
			
	public String getSurName();
	public void setSurName(String surName);

	public String getLogin();
	public void setLogin(String login);
		
	public String getPassword();
	public void setPassword(String password);
		
	public String getEmail();
	public void setEmail(String email);
		
	public String getAddress();
	public void setAddress(String address);
		
//	public int getIdProgramSemester() ;
//	public void setIdProgramSemester(int IdProgramSemester) ;
	
	public void addDeferral(Deferral deferral);
	public void deleteDeferral(int ID);
	

	
	

	
	public Module getElective(int ID);
	public void setElective(Module elective);
	public void addElective(Module elective);
	public void deleteElective(int ID);
	
	public ProgramSemester getProgramSemester(); 
	public void setProgramSemester(ProgramSemester programSemester); 
	public void addProgramSemester(ProgramSemester programSemester); 
	public void deleteProgramSemester(int ID);

}
