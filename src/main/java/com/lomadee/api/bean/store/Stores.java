/**
 * 
 */
package com.lomadee.api.bean.store;

import java.util.List;

import com.lomadee.api.bean.RestResponse;

/**
 * @author Daniel Freire (2 de ago de 2016)
 *
 */
public class Stores extends RestResponse {

	private static final long serialVersionUID = 1L;
	
	private List<Store> stores;

	/**
	 * @return the stores
	 */
	public List<Store> getStores() {
		return stores;
	}

	/**
	 * @param stores the stores to set
	 */
	public void setStores(List<Store> stores) {
		this.stores = stores;
	}

}
