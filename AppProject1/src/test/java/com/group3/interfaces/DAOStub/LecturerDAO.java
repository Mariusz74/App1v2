
/**
 * @Author: Mikhail
 */
package com.group3.interfaces.DAOStub;

import java.util.List;

import com.group3.interfaces.Lecturer;
import com.group3.interfaces.Deferral;

/**
 * @author Mikhail
 *
 */
public interface LecturerDAO {
	public boolean create(Lecturer lecturer);
	public boolean delete(String ID);
	public boolean update(Lecturer lecturer);
	public Lecturer find(String ID);
	public List<Lecturer> getAll(Lecturer lecturer);
	
}
