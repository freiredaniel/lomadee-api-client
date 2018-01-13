/**
 * 
 */
package com.lomadee.api.bean.extras;

import java.io.Serializable;

/**
 * @author Daniel Freire (22 de mai de 2016)
 *
 */
public class UserRating implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer comments;
	private Integer rating;
	
	/**
	 * @return the comments
	 */
	public Integer getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(Integer comments) {
		this.comments = comments;
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
