/**
 * 
 */
package com.lomadee.api.bean.coupon;

import java.io.Serializable;

/**
 * @author Daniel Freire (28 de ago de 2016)
 *
 */
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String 	name;
	
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
