/**
 * 
 */
package com.lomadee.api.bean.advertiser;

import java.io.Serializable;
import java.util.List;

/**
 * @author Daniel Freire (31 de mar de 2016)
 *
 */
public class Advertiser implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer empId;
	private String name;
	private List<String> images;
	private String maxCommission;
	private Long cookieLatency;
	private Integer categoryId;
	private String category;
	private String eventType;
	private Boolean typeCommission;
	private String url;
	private String shortDescription;
	private String description;
	private String seo;
	private String tags;
	private Boolean hasEmailMarketing;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the images
	 */
	public List<String> getImages() {
		return images;
	}

	/**
	 * @param images
	 *            the images to set
	 */
	public void setImages(List<String> images) {
		this.images = images;
	}

	/**
	 * @return the maxCommission
	 */
	public String getMaxCommission() {
		return maxCommission;
	}

	/**
	 * @param maxCommission
	 *            the maxCommission to set
	 */
	public void setMaxCommission(String maxCommission) {
		this.maxCommission = maxCommission;
	}

	/**
	 * @return the cookieLatency
	 */
	public Long getCookieLatency() {
		return cookieLatency;
	}

	/**
	 * @param cookieLatency
	 *            the cookieLatency to set
	 */
	public void setCookieLatency(Long cookieLatency) {
		this.cookieLatency = cookieLatency;
	}

	/**
	 * @return the categoryId
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId
	 *            the categoryId to set
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the eventType
	 */
	public String getEventType() {
		return eventType;
	}

	/**
	 * @param eventType
	 *            the eventType to set
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	/**
	 * @return the typeCommission
	 */
	public Boolean getTypeCommission() {
		return typeCommission;
	}

	/**
	 * @param typeCommission
	 *            the typeCommission to set
	 */
	public void setTypeCommission(Boolean typeCommission) {
		this.typeCommission = typeCommission;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * @param shortDescription
	 *            the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the seo
	 */
	public String getSeo() {
		return seo;
	}

	/**
	 * @param seo
	 *            the seo to set
	 */
	public void setSeo(String seo) {
		this.seo = seo;
	}

	/**
	 * @return the tags
	 */
	public String getTags() {
		return tags;
	}

	/**
	 * @param tags
	 *            the tags to tags
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}

	/**
	 * @return whether has or not email marketing for publishers.
	 */
	public Boolean getHasEmailMarketing() {
		return hasEmailMarketing;
	}

	/**
	 * @param hasEmailMarketing
	 * 			Wheter the advertiser has or not email marketings.
	 */
	public void setHasEmailMarketing(Boolean hasEmailMarketing) {
		this.hasEmailMarketing = hasEmailMarketing;
	}

}
