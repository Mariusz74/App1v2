
/**
 * @Author: Mikhail
 */
package com.group3.DAOImpl;

import java.util.List;

import com.group3.interfaces.Student;
import com.group3.interfaces.Module;
import com.group3.interfaces.Student;
import com.group3.interfaces.DAOStub.StudentDAO;

/**
 * @author Mikhail
 *
 */
public class StudentDAOImpl implements StudentDAO {

		List<Student> deferrals; 
	public StudentDAOImpl(List<Student> student)
	{
		this.deferrals=student;
	}
	
	
	
	@Override
	public void create(Student student) {
		this.deferrals.add(student);
	}

	@Override
	public void delete(String ID) {
		for(Student def:deferrals)
		{
			if(def.getID().equalsIgnoreCase(ID)==true)
			{
				this.deferrals.remove(ID);
			}
		}
	}

	@Override
	public void update(Student student) {
		int index=0;
		for(Student def:deferrals)
		{
			if(def.getID()==student.getID())
			{
				this.deferrals.set(index, student);
			}
			index++;
		}
	}

	@Override
	public Student find(String ID) {
		Student student=null;
		
		for(Student def:deferrals)
		{
			if(def.getID().equalsIgnoreCase(ID)==true)
			{
				student= def;
			}
		}
		
		return student;
	}

	@Override
	public List<Student> getAll() {
		return this.deferrals;
	}
}
