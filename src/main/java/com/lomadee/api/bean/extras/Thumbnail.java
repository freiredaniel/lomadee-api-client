/**
 * 
 */
package com.lomadee.api.bean.extras;

import java.io.Serializable;
import java.util.List;

/**
 * @author Daniel Freire (22 de mai de 2016)
 *
 */
public class Thumbnail implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String url;
	private Integer height;
	private Integer width;
	private List<Thumbnail> otherFormats;
	
	/**
	 * 
	 */
	public Thumbnail() {
	}
	
	/**
	 * @param string
	 */
	public Thumbnail(String url) {
		this.url = url;
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
	 * @return the height
	 */
	public Integer getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}
	/**
	 * @return the width
	 */
	public Integer getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}
	/**
	 * @return the otherFormats
	 */
	public List<Thumbnail> getOtherFormats() {
		return otherFormats;
	}
	/**
	 * @param otherFormats the otherFormats to set
	 */
	public void setOtherFormats(List<Thumbnail> otherFormats) {
		this.otherFormats = otherFormats;
	}

}
