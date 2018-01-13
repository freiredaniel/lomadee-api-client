/**
 * 
 */
package com.lomadee.api.bean;

import java.io.Serializable;

/**
 * @author Daniel Freire (21 de mai de 2016)
 *
 */
public class RequestInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String status;
	private String message;
	private String generatedDate;


	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(final String message) {
		this.message = message;
	}

	/**
	 * @return the generatedDate
	 */
	public String getGeneratedDate() {
		return generatedDate;
	}

	/**
	 * @param generatedDate the generatedDate to set
	 */
	public void setGeneratedDate(String generatedDate) {
		this.generatedDate = generatedDate;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
