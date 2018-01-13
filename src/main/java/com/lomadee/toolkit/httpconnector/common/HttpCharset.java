/**
 * 
 */
package com.lomadee.toolkit.httpconnector.common;

/**
 * @author Daniel Freire (12 de mar de 2016)
 *
 */
public enum HttpCharset {
	UTF_8("UTF-8"), ISO_8859_1("ISO-8859-1");
	
	private String value;
	
	private HttpCharset(String value) {
		this.value = value;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return value;
	}

}
