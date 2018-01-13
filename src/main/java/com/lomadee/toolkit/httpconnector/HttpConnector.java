/**
 * 
 */
package com.lomadee.toolkit.httpconnector;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;

import com.lomadee.toolkit.httpconnector.common.HttpCharset;
import com.lomadee.toolkit.httpconnector.common.HttpMethod;

/**
 * @author Daniel Freire (13 de mar de 2016)
 *
 */
public class HttpConnector {
	
	private static final Map<Integer, CloseableHttpClient> connectionsByTimeout = new HashMap<>();
	private HttpRequest request = new HttpRequest();
	
	public HttpResponse execute() {
		CloseableHttpClient connection = connectionsByTimeout.get(request.getTimeout());
		if (connection==null) {
			connection = HttpConnectionBuilder.build(request.getTimeout());
			connectionsByTimeout.put(request.getTimeout(), connection);
		}
		
		HttpResource resource = new HttpResource(connection, request);
		if (request.getMethod().equals(HttpMethod.GET)) {
			return resource.get();
		} else if (request.getMethod().equals(HttpMethod.DELETE)) {
			return resource.delete();
		} else if (request.getMethod().equals(HttpMethod.PATCH)) {
			return resource.patch();
		} else {
			return resource.postOrPut();
		}
	}

	public HttpConnector setUrl(String url) {
		this.request.setUrl(url);
		return this;
	}
	
	public HttpConnector setMethod(HttpMethod method) {
		this.request.setMethod(method);
		return this;
	}
	
	public HttpConnector setTimeout(int timeout) {
		this.request.setTimeout(timeout);
		return this;
	}
	
	public HttpConnector setBody(String body) {
		this.request.setBody(body);
		return this;
	}
	
	public HttpConnector setHeaders(Map<String,String> headers) {
		this.request.setHeaders(headers);
		return this;
	}
	
	public HttpConnector setCharset(HttpCharset charset) {
		this.request.setCharset(charset);
		return this;
	}
	
	public HttpConnector setContentType(ContentType contentType) {
		this.request.setContentType(contentType);
		return this;
	}
	
	@Deprecated
	public HttpConnector addFormParameter(String name, String value)
	{	
		this.request.addFormParameter(name, value);
		return this;
	}
	
	public HttpConnector addHeader(String header, String value) {
		this.request.getHeaders().put(header, value);
		return this;
	}
	
}
