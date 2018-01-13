/**
 * 
 */
package com.lomadee.api.bean.deeplink;

import java.io.Serializable;

/**
 * @author daniel.freire (1 de mai de 2017)
 *
 */
public class DeepLink implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Boolean status;
	private String message;
	private String deeplink;
	private String urlOrigin;
	
	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the deeplink
	 */
	public String getDeeplink() {
		return deeplink;
	}
	/**
	 * @param deeplink the deeplink to set
	 */
	public void setDeeplink(String deeplink) {
		this.deeplink = deeplink;
	}
	/**
	 * @return the urlOrigin
	 */
	public String getUrlOrigin() {
		return urlOrigin;
	}
	/**
	 * @param urlOrigin the urlOrigin to set
	 */
	public void setUrlOrigin(String urlOrigin) {
		this.urlOrigin = urlOrigin;
	}
	

}
