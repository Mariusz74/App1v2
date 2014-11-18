// Mariusz
package com.group3.interfaces;

import java.util.List;

public interface ModuleLecturer {
	
	public int getId();
	public void setId(int moduleId);
	
	public int getIdModule();
	public void setIdModule(int idModule);
	
	public Module getModule();
	public void setModule(Module module);
	
	public int getIdLecturer();
	public void setIdLecturer(int idLecturer);
	
	public Lecturer getLecturer();
	public void setLecturer(Lecturer lecturer);
}
