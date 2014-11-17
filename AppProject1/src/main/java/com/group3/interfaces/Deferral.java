/*Author:Mikhail*/
/*Author2:Mariusz*/
package com.group3.interfaces;

import java.util.List;


import com.group3.domain.Status;


public interface Deferral {
	
	public int getID();
	public void setID(int iD);
	public String getImageAddress() ;
	public void setImageAddress(String imageAddress);
	public Status getStatus() ;
	public void setStatus(Status status);
	public Student getStudent() ;
	public void setStudent(Student student) ;
	public ModuleLecturer getModuleLecture() ;
	public void setModuleLecture(ModuleLecturer moduleLecture) ;
	
	//public Lecturer getLecturer() ;
	//public void setLecturer(Lecturer lecturer);

	//public List<Module> getModule();
	//public void setModule(List<Module> module) ;
	public boolean isProccesed();
	public void setProccesed(boolean isProccesed) ;


}
