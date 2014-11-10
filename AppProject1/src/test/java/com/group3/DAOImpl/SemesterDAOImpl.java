
/**
 * @Author: Mikhail
 */
package com.group3.DAOImpl;

import java.util.List;

import com.group3.interfaces.Semester;
import com.group3.interfaces.Semester;
import com.group3.interfaces.DAOStub.SemesterDAO;

/**
 * @author Mikhail
 *
 */
public class SemesterDAOImpl implements SemesterDAO {

		List<Semester> Semesters; 
	public SemesterDAOImpl(List<Semester> Semester)
	{
		this.Semesters=Semester;
	}
	
	
	
	@Override
	public void create(Semester Semester) {
		this.Semesters.add(Semester);
	}

	@Override
	public void delete(int ID) {
		for(Semester def:Semesters)
		{
			if(def.getID()==ID)
			{
				this.Semesters.remove(ID);
			}
		}
	}

	@Override
	public void update(Semester Semester) {
		int index=0;
		for(Semester def:Semesters)
		{
			if(def.getID()==Semester.getID())
			{
				this.Semesters.set(index, Semester);
			}
			index++;
		}
	}

	@Override
	public Semester find(int ID) {
		Semester Semester=null;
		
		for(Semester def:Semesters)
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
		return this.Semesters;
	}
}
