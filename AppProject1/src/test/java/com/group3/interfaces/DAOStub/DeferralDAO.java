
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

	public void create(Deferral deferral);
	public void delete(int ID);
	public void update(Deferral deferral);
	public Deferral find(int ID);
	public List<Deferral> getAll(Deferral deferral);
	
}
