/**
 * 
 */
package com.lomadee.api.bean;

import java.io.Serializable;

/**
 * @author Daniel Freire (21 de mai de 2016)
 *
 */
public class RequestPagination implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer page;
	private Integer size;
	private Integer totalSize;
	private Integer totalPage;
	
	/**
	 * @return the page
	 */
	public Integer getPage() {
		return page;
	}
	/**
	 * @param page the page to set
	 */
	public void setPage(final Integer page) {
		this.page = page;
	}
	/**
	 * @return the size
	 */
	public Integer getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(final Integer size) {
		this.size = size;
	}
	/**
	 * @return the totalSize
	 */
	public Integer getTotalSize() {
		return totalSize;
	}
	/**
	 * @param totalSize the totalSize to set
	 */
	public void setTotalSize(final Integer totalSize) {
		this.totalSize = totalSize;
	}
	/**
	 * @return the totalPage
	 */
	public Integer getTotalPage() {
		return totalPage;
	}
	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(final Integer totalPage) {
		this.totalPage = totalPage;
	}

}
