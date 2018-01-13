/**
 * 
 */
package com.lomadee.api.bean.deeplink;

import java.util.List;

import com.lomadee.api.bean.RestResponse;

/**
 * @author daniel.freire (1 de mai de 2017)
 *
 */
public class DeepLinks extends RestResponse {

	private static final long serialVersionUID = 1L;
	
	private List<DeepLink> deeplinks;

	/**
	 * @return the deeplinks
	 */
	public List<DeepLink> getDeeplinks() {
		return deeplinks;
	}

	/**
	 * @param deeplinks the deeplinks to set
	 */
	public void setDeeplinks(List<DeepLink> deeplinks) {
		this.deeplinks = deeplinks;
	}

}
