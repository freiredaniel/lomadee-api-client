/**
 *
 */
package com.lomadee.toolkit.httpconnector;

import java.io.Serializable;

/**
 * @author Daniel Freire (12 de mar de 2016)
 *
 */
public class HttpResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean status;
	private String exception;
	private int httpCode;
	private String body;
	private HttpRequest request;

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	/**
	 * @return the httpCode
	 */
	public int getHttpCode() {
		return httpCode;
	}
	/**
	 * @param httpCode the httpCode to set
	 */
	public void setHttpCode(int httpCode) {
		this.httpCode = httpCode;
	}
	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}
	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}
	/**
	 * @return the request
	 */
	public HttpRequest getRequest() {
		return request;
	}
	/**
	 * @param request the request to set
	 */
	public void setRequest(HttpRequest request) {
		this.request = request;
	}
	/**
	 * @return the exception
	 */
	public String getException() {
		return exception;
	}
	/**
	 * @param exception the exception to set
	 */
	public void setException(String exception) {
		this.exception = exception;
	}

}
