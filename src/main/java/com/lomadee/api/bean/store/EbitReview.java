/**
 * 
 */
package com.lomadee.api.bean.store;

import java.io.Serializable;

/**
 * @author Daniel Freire (2 de ago de 2016)
 *
 */
public class EbitReview implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Integer rating;
	
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
	/**
	 * @return the rating
	 */
	public Integer getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	

}
