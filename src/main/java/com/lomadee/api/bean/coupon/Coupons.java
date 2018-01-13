/**
 * 
 */
package com.lomadee.api.bean.coupon;

import java.util.List;

import com.lomadee.api.bean.RestResponse;

/**
 * @author Daniel Freire (28 de ago de 2016)
 *
 */
public class Coupons extends RestResponse {

	private static final long serialVersionUID = 1L;
	
	private List<Coupon> coupons;
	private List<Category> categories;
	private List<Store> stores;
	
	/**
	 * @return the coupons
	 */
	public List<Coupon> getCoupons() {
		return coupons;
	}
	/**
	 * @param coupons the coupons to set
	 */
	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}
	/**
	 * @return the categories
	 */
	public List<Category> getCategories() {
		return categories;
	}
	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
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
