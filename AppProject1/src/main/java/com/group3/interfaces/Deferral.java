/*Author:Mikhail*/
package com.group3.interfaces;

import java.util.List;

import com.group3.domain.SearchModel;
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

	
	public DeferralHandler getLecturer() ;
	public void setLecturer(DeferralHandler lecturer);

	public List<Module> getModule();
	public void setModule(List<Module> module) ;
	public boolean isProccesed();
	public void setProccesed(boolean isProccesed) ;


}
