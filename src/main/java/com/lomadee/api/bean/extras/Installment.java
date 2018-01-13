/**
 * 
 */
package com.lomadee.api.bean.extras;

import java.io.Serializable;

/**
 * @author Daniel Freire (10 de ago de 2016)
 *
 */
public class Installment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer quantity;
	private Double value;
	
	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the value
	 */
	public Double getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Double value) {
		this.value = value;
	}

}
