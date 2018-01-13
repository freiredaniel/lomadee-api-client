/**
 * 
 */
package com.lomadee.api.bean;

import java.io.Serializable;

/**
 * @author Daniel Freire (21 de mai de 2016)
 *
 */
public class RestResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private RequestInfo requestInfo;
	private RequestPagination pagination;

	/**
	 * @return the requestInfo
	 */
	public RequestInfo getRequestInfo() {
		return requestInfo;
	}

	/**
	 * @param requestInfo the requestInfo to set
	 */
	public void setRequestInfo(final RequestInfo requestInfo) {
		this.requestInfo = requestInfo;
	}

	/**
	 * @return the pagination
	 */
	public RequestPagination getPagination() {
		return pagination;
	}

	/**
	 * @param pagination the pagination to set
	 */
	public void setPagination(final RequestPagination pagination) {
		this.pagination = pagination;
	}

}
