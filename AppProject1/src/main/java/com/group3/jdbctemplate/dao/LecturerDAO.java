
/**
 * @Author: Mikhail
 */
package com.group3.jdbctemplate.dao;

import java.util.List;

import javax.sql.DataSource;

import com.group3.domain.Lecturer;
import com.group3.interfaces.Deferral;

/**
 * @author Mikhail
 *
 */
public interface LecturerDAO {
	public void setDataSource(DataSource ds);
	public int create(Lecturer lecturer);
	public int delete(int ID);
	public int update(Lecturer lecturer);
	public Lecturer find(int ID);
	public List<Lecturer> getAll();
	
}
