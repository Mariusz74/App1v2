/*Author:Mikhail
 * Encapsulate deferral search logic by using strategy pattern.
 * There can be many implementation this interface each of which contains logic
 * for different webpage.
 * */
package com.group3.interfaces;

import com.group3.domain.SearchModel;

public interface DeferralSearchStrategy {
	
	Deferral Search(SearchModel model);
	
}
