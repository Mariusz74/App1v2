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
	public int getIdStatus();
	public void setIdStatus(int status);
	public Student getStudent() ;
	public void setStudent(Student student) ;
	public int getIdStudent() ;
	public void setIdStudent(int idStudent) ;	
	//public ModuleLecturer getModuleLecture() ;
	//public void setModuleLecture(ModuleLecturer moduleLecture) ;
	public List<Module> getModule();
	public void setModule(List<Module> module) ;
	public int getIdDeferralModule() ;
	public void setIdDeferralModule(int idDeferralModule) ;	
	public Lecturer getLecturer() ;
	public void setLecturer(Lecturer lecturer);
	public int getIdLecturer() ;
	public void setIdLecturer(int idLecturer) ;	
	public boolean isProccesed();
	public void setProccesed(boolean isProccesed) ;


}
