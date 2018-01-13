/**
 *
 */
package com.lomadee.toolkit.httpconnector;

import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;

/**
 * @author Daniel Freire (30/08/2015)
 *
 */
public enum HttpConnectionBuilder {;

	/**
	 * @return
	 */
	public static CloseableHttpClient build(int timeout) {
		PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
		cm.setDefaultMaxPerRoute(20);

		RequestConfig requestConfig = RequestConfig.custom()
				.setConnectTimeout(timeout)
				.setSocketTimeout(30000) //30 segundos
				.setMaxRedirects(5)
				.setRedirectsEnabled(true)
				.build();

		ConnectionKeepAliveStrategy myStrategy = new ConnectionKeepAliveStrategy() {

		    public long getKeepAliveDuration(HttpResponse response, HttpContext context) {
		        HeaderElementIterator it = new BasicHeaderElementIterator(response.headerIterator(HTTP.CONN_KEEP_ALIVE));
		        while (it.hasNext()) {
		            HeaderElement he = it.nextElement();
		            String param = he.getName();
		            String value = he.getValue();
		            if (value != null && param.equalsIgnoreCase("timeout")) {
		                try {
		                    return Long.parseLong(value) * 1000;
		                } catch(NumberFormatException ignore) {
		                }
		            }
		        }
		        // 30 seconds
		        return 30 * 1000;
		    }

		};

		return HttpClients.custom()
	        .setDefaultRequestConfig(requestConfig)
	        .setConnectionManager(cm)
	        .setKeepAliveStrategy(myStrategy)
	        .build();
	}

}
