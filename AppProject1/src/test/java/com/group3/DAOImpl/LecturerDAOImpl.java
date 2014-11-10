
/**
 * @Author: Mikhail
 */
package com.group3.DAOImpl;

import java.util.List;

import com.group3.domain.Lecturer;
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
	public void create(Lecturer Lecturer) {
		this.Lecturers.add(Lecturer);
	}

	@Override
	public void delete(String ID) {
		for(Lecturer def:Lecturers)
		{
			if(def.getID().equalsIgnoreCase(ID)==true)
			{
				this.Lecturers.remove(ID);
			}
		}
	}

	@Override
	public void update(Lecturer Lecturer) {
		int index=0;
		for(Lecturer def:Lecturers)
		{
			if(def.getID()==Lecturer.getID())
			{
				this.Lecturers.set(index, Lecturer);
			}
			index++;
		}
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
