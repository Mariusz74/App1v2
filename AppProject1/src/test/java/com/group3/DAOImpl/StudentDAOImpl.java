
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

		List<Student> students; 
	public StudentDAOImpl(List<Student> students)
	{
		this.students=students;
	}
	
	
	
	@Override
	public boolean create(Student student) {
		return this.students.add(student);
	}

	@Override
	public boolean delete(String ID) {
		for(Student def:students)
		{
			if(def.getID().equalsIgnoreCase(ID)==true)
			{
				this.students.remove(ID);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean update(Student student) {
		int index=0;
		for(Student def:students)
		{
			if(def.getID()==student.getID())
			{
				this.students.set(index, student);
				return true;
			}
			index++;
		}
		return false;
	}

	@Override
	public Student find(String ID) {
		Student student=null;
		
		for(Student def:students)
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
		return this.students;
	}
}
