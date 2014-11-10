
/**
 * @Author: Mikhail
 */
package com.group3.interfaces.DAOStub;

import java.util.List;

import com.group3.interfaces.Deferral;

/**
 * @author Mikhail
 *
 */
public interface DeferralDAO {

	public boolean create(Deferral deferral);
	public boolean delete(int ID);
	public boolean update(Deferral deferral);
	public Deferral find(int ID);
	public List<Deferral> getAll(Deferral deferral);
	
}
