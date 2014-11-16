
/**
 * @Author: Mikhail
 */
package com.group3.domain;

import com.group3.interfaces.Semester;

/**
 * @author Mikhail
 *
 */
public class SemesterImpl implements Semester{
	
	
	String name;
	int ID;
	
	public SemesterImpl(String name){
		this.name=name;
	}
	public SemesterImpl(){
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
}
