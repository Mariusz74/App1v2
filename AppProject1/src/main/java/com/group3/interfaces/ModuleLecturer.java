package com.group3.interfaces;

import java.util.List;

public interface ModuleLecturer {
	
	public int getID();
	public void setID(int moduleID);
	
	public Lecturer getLecturer();
	public void setLecturer(Lecturer lecturer);
	
	public Module getModule();
	public void setModule(Module module);

}
