/**
 * 
 */
package com.lomadee.api.bean.store;

import java.io.Serializable;

/**
 * @author Daniel Freire (2 de ago de 2016)
 *
 */
public class Store implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String thumbnail;
	private EbitReview ebit;
	private Boolean selected;
	private String link;
	private Integer hasOffer;
	private Double maxCommission;
	private Boolean ocb;
	
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
	 * @return the thumbnail
	 */
	public String getThumbnail() {
		return thumbnail;
	}
	/**
	 * @param thumbnail the thumbnail to set
	 */
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
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
	 * @return the ebit
	 */
	public EbitReview getEbit() {
		return ebit;
	}
	/**
	 * @param ebit the ebit to set
	 */
	public void setEbit(EbitReview ebit) {
		this.ebit = ebit;
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
	 * @return the maxCommission
	 */
	public Double getMaxCommission() {
		return maxCommission;
	}
	/**
	 * @param maxCommission the maxCommission to set
	 */
	public void setMaxCommission(Double maxCommission) {
		this.maxCommission = maxCommission;
	}
	
	public Boolean getOcb() {
		return ocb;
	}
	
	public void setOcb(Boolean ocb) {
		this.ocb = ocb;
	}
	
	
}
