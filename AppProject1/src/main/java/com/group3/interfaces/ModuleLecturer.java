package com.group3.interfaces;

import java.util.List;

public interface ModuleLecturer {
	
	public int getID();
	public void setID(int moduleID);
	
	public List<Lecturer> getLecturer();
	public void setLecturer(List<Lecturer> lecturer);
	
	public List<Student> getStudents();
	public void setStudents(List<Student> students);

}
