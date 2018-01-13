/**
 * 
 */
package com.lomadee.api.bean.category;

import java.util.List;

import com.lomadee.api.bean.RestResponse;

/**
 * @author Daniel Freire (21 de mai de 2016)
 *
 */
public class Categories extends RestResponse {

	private static final long serialVersionUID = 1L;
	
	private List<Category> categories;

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

}
