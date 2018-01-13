/**
 * 
 */
package com.lomadee.toolkit.httpconnector;

import java.io.UnsupportedEncodingException;

import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.lomadee.toolkit.httpconnector.common.HttpMethod;

/**
 * @author Daniel Freire (30/08/2015)
 *
 */
class HttpResource {
	
	private CloseableHttpClient connection;
	private Gson gson;
	private HttpRequest request;
	
	/**
	 * 
	 */
	public HttpResource(CloseableHttpClient connection, HttpRequest request) {
		this.connection = connection;
		this.request = request;
		this.gson = new Gson();
	}
	
	public HttpResponse get() {
		return execute(new HttpGet(request.getUrl()));
	}
	
	public HttpResponse delete() {
		return execute(new HttpDelete(request.getUrl()));
	}
	
	@SuppressWarnings("deprecation")
	public HttpResponse patch() {
		try {
			String charset = request.getCharset().toString();
			String contenType = request.getContentType().getMimeType();
			
			HttpEntityEnclosingRequestBase patch = null;
			if (request.getMethod().equals(HttpMethod.PATCH)) {
				patch = new HttpPatch(request.getUrl());
			} 
			
			if (request.getBody()!=null) {
				String body = null;
				if (request.getBody() instanceof String) {
					body = request.getBody().toString();
				} else if (request.getContentType().equals(ContentType.APPLICATION_JSON)) {
					body = gson.toJson(request.getBody());
				}
				
				if (body==null) {
					throw new UnsupportedEncodingException();
				}
				
				patch.setEntity(new StringEntity(body, contenType, charset));
			}
			
			return execute(patch);
		} catch (Exception e) {
			HttpResponse resp = new HttpResponse();
			resp.setException(e.getMessage());
			resp.setStatus(Boolean.FALSE);
			resp.setRequest(request);
			
			return resp;
		}
	}
	
	@SuppressWarnings("deprecation")
	public HttpResponse postOrPut() {
		try {
			String charset = request.getCharset().toString();
			String contenType = request.getContentType().getMimeType();
			
			HttpEntityEnclosingRequestBase post;
			if (request.getMethod().equals(HttpMethod.POST)) {
				post = new HttpPost(request.getUrl());
			} else {
				post = new HttpPut(request.getUrl());
			}
			
			if (request.getBody()!=null) {
				String body = null;
				if (request.getBody() instanceof String) {
					body = request.getBody().toString();
				} else if (request.getContentType().equals(ContentType.APPLICATION_JSON)) {
					body = gson.toJson(request.getBody());
				}
				
				if (body==null) {
					throw new UnsupportedEncodingException();
				}
				
				post.setEntity(new StringEntity(body, contenType, charset));
			}else if(request.getParameters() != null || !request.getParameters().isEmpty()){
				post.setEntity(new UrlEncodedFormEntity(request.getParameters()));
			}
			
			return execute(post);
		} catch (Exception e) {
			HttpResponse resp = new HttpResponse();
			resp.setException(e.getMessage());
			resp.setStatus(Boolean.FALSE);
			resp.setRequest(request);
			
			return resp;
		}
	}
	
	/**
	 * @param httpDelete
	 * @param request
	 * @return
	 */
	private HttpResponse execute(HttpRequestBase method) {
		setHeaders(method, request);
		
		HttpResponse resp = new HttpResponse();
		try {
			CloseableHttpResponse response = connection.execute(method);
			resp.setRequest(request);
			resp.setHttpCode(response.getStatusLine().getStatusCode());
			resp.setStatus(resp.getHttpCode()==200 || resp.getHttpCode()==201);
			try {
				if(resp.getHttpCode() != 204){
					resp.setBody(EntityUtils.toString(response.getEntity(), request.getCharset().toString()));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			resp.setStatus(Boolean.FALSE);
			resp.setException(e.getMessage());
		} finally {
			method.releaseConnection();
		}
		
		return resp;
	}

	/**
	 * @param headers
	 * @param method 
	 * @param compression 
	 * @return
	 */
	private void setHeaders(HttpUriRequest method, HttpRequest request) {
		for (String key : request.getHeaders().keySet()) {
			method.addHeader(key, request.getHeaders().get(key));
		}
		if (request.isCompression()) {
			method.addHeader(HttpConstants.COMPRESSION_HEADER, HttpConstants.COMPRESSION_VALUE);
		}
	}
	
}
