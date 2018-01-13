/**
 * 
 */
package com.lomadee.api.bean.category;

import java.io.Serializable;
import java.util.List;

/**
 * @author Daniel Freire (22 de mai de 2016)
 *
 */
public class CategoryFilter implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private List<CategoryFilterOption> options;
	
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
	 * @return the options
	 */
	public List<CategoryFilterOption> getOptions() {
		return options;
	}
	/**
	 * @param options the options to set
	 */
	public void setOptions(List<CategoryFilterOption> options) {
		this.options = options;
	}

}
