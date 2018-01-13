/**
 * 
 */
package com.lomadee.api.bean.offer;

import java.io.Serializable;

/**
 * @author daniel.freire (30 de out de 2016)
 *
 */
public class PriceRange implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer priceMax;
	private Integer priceMin;
	private Boolean selected;
	
	/**
	 * 
	 */
	public PriceRange() {
		this.selected = Boolean.FALSE;
	}
	
	/**
	 * @param i
	 * @param j
	 */
	public PriceRange(int priceMin, int priceMax) {
		this.priceMin = priceMin;
		this.priceMax = priceMax;
		this.selected = Boolean.FALSE;
	}
	/**
	 * @return the priceMax
	 */
	public Integer getPriceMax() {
		return priceMax;
	}
	/**
	 * @param priceMax the priceMax to set
	 */
	public void setPriceMax(Integer priceMax) {
		this.priceMax = priceMax;
	}
	/**
	 * @return the priceMin
	 */
	public Integer getPriceMin() {
		return priceMin;
	}
	/**
	 * @param priceMin the priceMin to set
	 */
	public void setPriceMin(Integer priceMin) {
		this.priceMin = priceMin;
	}

	/**
	 * @return the selected
	 */
	public Boolean getSelected() {
		return selected;
	}

	/**
	 * @param selected the selected to set
	 */
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

}
