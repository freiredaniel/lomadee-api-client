/**
 * 
 */
package com.lomadee.api.bean.offer;

import java.util.List;

import com.lomadee.api.bean.RestResponse;

/**
 * @author Daniel Freire (2 de ago de 2016)
 *
 */
public class Offers extends RestResponse {

	private static final long serialVersionUID = 1L;
	
	private List<Offer> offers;

	/**
	 * @return the offers
	 */
	public List<Offer> getOffers() {
		return offers;
	}

	/**
	 * @param offers the offers to set
	 */
	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}

}
