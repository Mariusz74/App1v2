
/**
 * @Author: Mikhail
 */
package com.group3.domain;

import com.group3.interfaces.Module;
import com.group3.interfaces.ProgramSemester;

/**
 * @author Mikhail
 *
 */
public class Student {
	String Name;
	String ID;
	Module Elective;
	ProgramSemester classgroup;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Module getElective() {
		return Elective;
	}
	public void setElective(Module elective) {
		Elective = elective;
	}
	public ProgramSemester getClassgroup() {
		return classgroup;
	}
	public void setClassgroup(ProgramSemester classgroup) {
		this.classgroup = classgroup;
	}
	
	
}
