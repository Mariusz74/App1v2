
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
	int semesterNumber;
	int ID;
	
	public SemesterImpl(String name,int semesterNumber){
		this.name=name;
		this.semesterNumber=semesterNumber;
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Semester#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Semester#updateName(java.lang.String)
	 */
	@Override
	public void updateName(String name) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Semester#getID()
	 */
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Semester#updateID(int)
	 */
	@Override
	public void updateID(int iD) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Semester#getSemesterNumber()
	 */
	@Override
	public int getSemesterNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.group3.interfaces.Semester#setSemesterNumber(int)
	 */
	@Override
	public void updataeSemesterNumber(int semesterNumber) {
		// TODO Auto-generated method stub
		
	}
	
}
