/**
 * 
 */
package com.lomadee.api.bean.offer;

import java.util.List;

import com.lomadee.api.bean.RestResponse;

/**
 * @author daniel.freire (30 de out de 2016)
 *
 */
public class PriceRanges extends RestResponse {

	private static final long serialVersionUID = 1L;
	
	private List<PriceRange> range;

	/**
	 * @return the range
	 */
	public List<PriceRange> getRange() {
		return range;
	}

	/**
	 * @param range the range to set
	 */
	public void setRange(List<PriceRange> range) {
		this.range = range;
	}

}
