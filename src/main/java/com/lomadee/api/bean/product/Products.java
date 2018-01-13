/**
 * 
 */
package com.lomadee.api.bean.product;

import java.util.List;

import com.lomadee.api.bean.RestResponse;

/**
 * @author Daniel Freire (22 de mai de 2016)
 *
 */
public class Products extends RestResponse {

	private static final long serialVersionUID = 1L;
	
	private List<Product> products;

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
