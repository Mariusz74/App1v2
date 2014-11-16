
/**
 * @Author: Mikhail
 */
package com.group3.jdbctemplate.dao;

import java.util.List;

import com.group3.interfaces.Lecturer;
import com.group3.interfaces.Deferral;

/**
 * @author Mikhail
 *
 */
public interface LecturerDAO {
	public int create(Lecturer lecturer);
	public int delete(int ID);
	public int update(Lecturer lecturer);
	public Lecturer find(int ID);
	public List<Lecturer> getAll();
	
}
