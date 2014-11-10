
/**
 * @Author: Mikhail
 */
package com.group3.interfaces.DAOStub;

import java.util.List;

import com.group3.interfaces.Module;
import com.group3.interfaces.Program;
import com.group3.interfaces.Student;

/**
 * @author Mikhail
 *
 */
public interface StudentDAO {
	public void create(Student student);
	public void delete(String ID);
	public void update(Student student);
	public Student find(String ID);
	public List<Student> getAll();
}
