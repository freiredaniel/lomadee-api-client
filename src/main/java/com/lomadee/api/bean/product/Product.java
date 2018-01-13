/**
 * 
 */
package com.lomadee.api.bean.product;

import java.io.Serializable;
import java.util.Map;

import com.lomadee.api.bean.category.Category;
import com.lomadee.api.bean.extras.Thumbnail;
import com.lomadee.api.bean.extras.UserRating;

/**
 * @author Daniel Freire (22 de mai de 2016)
 *
 */
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String shortName;
	private Double priceMin;
	private Double priceMax;
	private Integer discount;
	private Thumbnail thumbnail;
	private UserRating userRating;
	private Map<String, String> technicalSpecification;
	private Category category;
	private Integer hasOffer;
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
	 * @return the priceMin
	 */
	public Double getPriceMin() {
		return priceMin;
	}
	/**
	 * @param priceMin the priceMin to set
	 */
	public void setPriceMin(Double priceMin) {
		this.priceMin = priceMin;
	}
	/**
	 * @return the priceMax
	 */
	public Double getPriceMax() {
		return priceMax;
	}
	/**
	 * @param priceMax the priceMax to set
	 */
	public void setPriceMax(Double priceMax) {
		this.priceMax = priceMax;
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
	 * @return the userRating
	 */
	public UserRating getUserRating() {
		return userRating;
	}
	/**
	 * @param userRating the userRating to set
	 */
	public void setUserRating(UserRating userRating) {
		this.userRating = userRating;
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
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
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}
	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	/**
	 * @return the technicalSpecification
	 */
	public Map<String, String> getTechnicalSpecification() {
		return technicalSpecification;
	}
	/**
	 * @param technicalSpecification the technicalSpecification to set
	 */
	public void setTechnicalSpecification(Map<String, String> technicalSpecification) {
		this.technicalSpecification = technicalSpecification;
	}
	/**
	 * @return the discount
	 */
	public Integer getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(Integer discount) {
		this.discount = discount;
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
