
/**
 * @Author: Mikhail
 */
package com.group3.domain;

import java.util.ArrayList;
import java.util.List;

import com.group3.interfaces.ProgramSemester;

/**
 * @author Mikhail
 *TODO add database context
 */
public class ProgramImpl {
	List<ProgramSemester> classGroups;
	String name;
	int ID;
	
	public  ProgramImpl(List<ProgramSemester> classGroups,String name )
	{
		this.classGroups=classGroups;
		this.name=name;
	}
	public List<ProgramSemester> getClassGroups() {
		return classGroups;
	}
	public void setClassGroups(List<ProgramSemester> classGroup) {
		this.classGroups = classGroup;
	}
	public void addClassGroup(ProgramSemester classGroup) {
		this.classGroups.add(classGroup);
	}
	public void deleteClassGroup(int classgroupID) {
		//	TODO use dbcontext here
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}

	
	
}
