
/**
 * @Author: Mikhail
 */
package com.group3.DAOImpl;

import java.util.List;

import com.group3.interfaces.Lecturer;
import com.group3.interfaces.DAOStub.LecturerDAO;


/**
 * @author Mikhail
 *
 */
public class LecturerDAOImpl implements LecturerDAO {
	List<Lecturer> Lecturers; 
	public LecturerDAOImpl(List<Lecturer> Lecturer)
	{
		this.Lecturers=Lecturer;
	}
	
	
	
	@Override
	public boolean create(Lecturer Lecturer) {
		return this.Lecturers.add(Lecturer);
	}

	@Override
	public boolean delete(String ID) {
		for(Lecturer def:Lecturers)
		{
			if(def.getID().equalsIgnoreCase(ID)==true)
			{
				this.Lecturers.remove(ID);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean update(Lecturer Lecturer) {
		int index=0;
		for(Lecturer def:Lecturers)
		{
			if(def.getID()==Lecturer.getID())
			{
				this.Lecturers.set(index, Lecturer);
				return true;
			}
			index++;
		}
		return false;
	}

	@Override
	public Lecturer find(String ID) {
		Lecturer Lecturer=null;
		
		for(Lecturer lec:Lecturers)
		{
			if(lec.getID().equalsIgnoreCase(ID)==true)
			{
				Lecturer= lec;
			}
		}
		
		return Lecturer;
	}

	@Override
	public List<Lecturer> getAll(Lecturer Lecturer) {
		return this.Lecturers;
	}
}
