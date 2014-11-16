
/**
 * @Author: Mikhail
 */
package com.group3.test.DAOImpl;

import java.util.List;

import com.group3.interfaces.Semester;
import com.group3.interfaces.Semester;
import com.group3.test.interfaces.DAOStub.SemesterDAO;

/**
 * @author Mikhail
 *
 */
public class SemesterDAOImpl implements SemesterDAO {

		List<Semester> semesters; 
	public SemesterDAOImpl(List<Semester> semesters)
	{
		this.semesters=semesters;
	}
	
	
	
	@Override
	public boolean create(Semester Semester) {
		return this.semesters.add(Semester);
	}

	@Override
	public boolean delete(int ID) {
		for(Semester def:semesters)
		{
			if(def.getID()==ID)
			{
				this.semesters.remove(ID);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean update(Semester Semester) {
		int index=0;
		for(Semester def:semesters)
		{
			if(def.getID()==Semester.getID())
			{
				this.semesters.set(index, Semester);
				return true;
			}
			index++;
		}
		return false;
	}

	@Override
	public Semester find(int ID) {
		Semester Semester=null;
		
		for(Semester def:semesters)
		{
			if(def.getID()==ID)
			{
				Semester= def;
			}
		}
		
		return Semester;
	}

	@Override
	public List<Semester> getAll() {
		return this.semesters;
	}
}
