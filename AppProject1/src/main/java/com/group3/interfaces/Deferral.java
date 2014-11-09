/*Author:Mikhail*/
package com.group3.interfaces;

import java.util.List;

import com.group3.domain.SearchModel;



public interface Deferral {

	public String getImageAddress() ;
	public void setImageAddress(String imageAddress);
	public DeferralHandler getLecturer() ;
	public void setLecturer(DeferralHandler lecturer);
	public Student getStudent() ;
	public void setStudent(Student student) ;
	public List<Module> getModule();
	public void setModule(List<Module> module) ;
	public boolean isProccesed();
	public void setProccesed(boolean isProccesed) ;
	public int getID();
	public void setID(int iD);

}
