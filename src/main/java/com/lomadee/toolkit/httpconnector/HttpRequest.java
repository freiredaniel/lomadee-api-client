/**
 *
 */
package com.lomadee.toolkit.httpconnector;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicNameValuePair;

import com.lomadee.toolkit.httpconnector.common.HttpCharset;
import com.lomadee.toolkit.httpconnector.common.HttpMethod;

/**
 * @author Daniel Freire (12 de mar de 2016)
 *
 */
class HttpRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private HttpMethod 			method;
	private String 				url;
	private Map<String, String> headers;
	private int 				timeout;
	private Object 				body;
	private HttpCharset 		charset;
	private ContentType 		contentType;
	private boolean 			compression;
	private List<NameValuePair> parameters = new ArrayList<NameValuePair>();

	public HttpRequest() {
		this.method = HttpMethod.GET;
		this.headers = new HashMap<>();
		this.charset = HttpCharset.UTF_8;
		this.contentType = ContentType.APPLICATION_JSON;
		this.timeout = HttpConstants.TIMEOUT_DEFAULT;
	}

	/**
	 * @return the method
	 */
	public HttpMethod getMethod() {
		return method;
	}

	/**
	 * @param method the method to set
	 */
	public void setMethod(HttpMethod method) {
		this.method = method;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the headers
	 */
	public Map<String, String> getHeaders() {
		return headers;
	}

	/**
	 * @param headers the headers to set
	 */
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	/**
	 * @return the timeout
	 */
	public int getTimeout() {
		return timeout;
	}

	/**
	 * @param timeout the timeout to set
	 */
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	/**
	 * @return the charset
	 */
	public HttpCharset getCharset() {
		return charset;
	}

	/**
	 * @param charset the charset to set
	 */
	public void setCharset(HttpCharset charset) {
		this.charset = charset;
	}

	/**
	 * @return the contentType
	 */
	public ContentType getContentType() {
		return contentType;
	}

	/**
	 * @param contentType the contentType to set
	 */
	public void setContentType(ContentType contentType) {
		this.contentType = contentType;
	}

	/**
	 * @return the body
	 */
	public Object getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(Object body) {
		this.body = body;
	}

	/**
	 * @return the compression
	 */
	public boolean isCompression() {
		return compression;
	}

	/**
	 * @param compression the compression to set
	 */
	public void setCompression(boolean compression) {
		this.compression = compression;
	}

	@Deprecated
	public void addFormParameter(String name, String value)
	{
		if(parameters == null){
			parameters = new ArrayList<NameValuePair>();
		}
		parameters.add(new BasicNameValuePair(name,value));
	}

	public List<NameValuePair> getParameters(){
		return this.parameters;
	}
}
