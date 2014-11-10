
/**
 * @Author: Mikhail
 */
package com.group3.interfaces.DAOStub;

import java.util.List;

import com.group3.domain.Lecturer;
import com.group3.interfaces.Deferral;

/**
 * @author Mikhail
 *
 */
public interface LecturerDAO {
	public void create(Lecturer lecturer);
	public void delete(String ID);
	public void update(Lecturer lecturer);
	public Lecturer find(String ID);
	public List<Lecturer> getAll(Lecturer lecturer);
	
}
