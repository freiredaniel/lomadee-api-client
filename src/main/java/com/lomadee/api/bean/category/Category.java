/**
 * 
 */
package com.lomadee.api.bean.category;

import java.io.Serializable;
import java.util.List;

import com.lomadee.api.bean.extras.Thumbnail;

/**
 * @author Daniel Freire (21 de mai de 2016)
 *
 */
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Thumbnail thumbnail;
	private Integer hasProduct;
	private Integer hasOffer;
	private List<CategoryFilter> filters; 
	private Boolean selected;
	private Integer groupId;
	private String groupName;
	private List<Category> subcategories;
	private String link;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the hasProduct
	 */
	public Integer getHasProduct() {
		return hasProduct;
	}
	/**
	 * @param hasProduct the hasProduct to set
	 */
	public void setHasProduct(Integer hasProduct) {
		this.hasProduct = hasProduct;
	}
	/**
	 * @return the hasOffer
	 */
	public Integer getHasOffer() {
		return hasOffer;
	}
	/**
	 * @param hasOffer the hasOffer to set
	 */
	public void setHasOffer(Integer hasOffer) {
		this.hasOffer = hasOffer;
	}
	/**
	 * @return the thumbnail
	 */
	public Thumbnail getThumbnail() {
		return thumbnail;
	}
	/**
	 * @param thumbnail the thumbnail to set
	 */
	public void setThumbnail(Thumbnail thumbnail) {
		this.thumbnail = thumbnail;
	}
	/**
	 * @return the filters
	 */
	public List<CategoryFilter> getFilters() {
		return filters;
	}
	/**
	 * @param filters the filters to set
	 */
	public void setFilters(List<CategoryFilter> filters) {
		this.filters = filters;
	}
	/**
	 * @return the selected
	 */
	public Boolean getSelected() {
		return selected;
	}
	/**
	 * @param selected the selected to set
	 */
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * @return the subcategories
	 */
	public List<Category> getSubcategories() {
		return subcategories;
	}
	/**
	 * @param subcategories the subcategories to set
	 */
	public void setSubcategories(List<Category> subcategories) {
		this.subcategories = subcategories;
	}
	/**
	 * @return the groupId
	 */
	public Integer getGroupId() {
		return groupId;
	}
	/**
	 * @param groupId the groupId to set
	 */
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

}
