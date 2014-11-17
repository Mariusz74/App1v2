
/**
 * @Author: Mikhail
 */
package com.group3.domain;

import java.util.List;

import com.group3.interfaces.Deferral;
import com.group3.interfaces.Module;
import com.group3.interfaces.ProgramSemester;
import com.group3.interfaces.Student;

/**
 * @author Mikhail
 *
 */
//TODO add db access
public class StudentImpl implements Student {	
	int ID;
	String firstName;
	String surName;
	String login;
	String password;
	String email;
	String address;
	Module Elective;
	ProgramSemester classgroup;
	List<Deferral> deferrals;
	
	public StudentImpl()
	{}
	
	@Override
	public int getID() {
		return ID;
	}

	@Override
	public void setID(int iD) {
		ID = iD;
	}	
		
	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getSurName() {
		return surName;
	}

	@Override
	public void setSurName(String surName) {
		this.surName = surName;
	}

	@Override
	public String getLogin() {
		return login;
	}

	@Override
	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void addDeferral(Deferral deferral) {
		this.deferrals.add(deferral);
	}
	
	@Override
	public void deleteDeferral(int ID) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Module getElective(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setElective(Module elective) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addElective(Module elective) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteElective(int ID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProgramSemester getProgramSemester() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProgramSemester(ProgramSemester programSemester) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProgramSemester(ProgramSemester programSemester) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProgramSemester(int ID) {
		// TODO Auto-generated method stub
		
	}

	public ProgramSemester getClassgroup() {
		return classgroup;
	}

	public void setClassgroup(ProgramSemester classgroup) {
		this.classgroup = classgroup;
	}

	public List<Deferral> getDeferrals() {
		return deferrals;
	}

	public void setDeferrals(List<Deferral> deferrals) {
		this.deferrals = deferrals;
	}

	public Module getElective() {
		return Elective;
	}
	
	
	
}
