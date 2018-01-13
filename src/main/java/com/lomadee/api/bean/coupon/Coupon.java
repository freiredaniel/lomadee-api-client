/**
 * 
 */
package com.lomadee.api.bean.coupon;

import java.io.Serializable;

/**
 * @author Daniel Freire (28 de ago de 2016)
 *
 */
public class Coupon implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer 	id;
	private String 		description;
	private String 		code;
	private Double 		discount;
	private Store 		store;
	private Category 	category;
	private String		vigency;
	private String 		link;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the discount
	 */
	public Double getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	/**
	 * @return the store
	 */
	public Store getStore() {
		return store;
	}
	/**
	 * @param store the store to set
	 */
	public void setStore(Store store) {
		this.store = store;
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	/**
	 * @return the vigency
	 */
	public String getVigency() {
		return vigency;
	}
	/**
	 * @param vigency the vigency to set
	 */
	public void setVigency(String vigency) {
		this.vigency = vigency;
	}
	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}
	
		
}
