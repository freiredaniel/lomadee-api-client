/**
 *
 */
package com.lomadee.api.bean.offer;

import java.io.Serializable;

import com.lomadee.api.bean.category.Category;
import com.lomadee.api.bean.extras.Installment;
import com.lomadee.api.bean.product.Product;
import com.lomadee.api.bean.store.Store;

/**
 * @author Daniel Freire (2 de ago de 2016)
 *
 */
public class Offer implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private Product product;
	private Category category;
	private String link;
	private String linkLomadee;
	private String thumbnail;
	private Double price;
	private Double priceLomadee;
	private Integer discount;
	private Installment installment;
	private Store store;
	private Boolean ocb;
	private Boolean bpmais;
	private Boolean freeshipping;

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
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
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
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
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
	 * @return the store
	 */
	public Store getStore() {
		return store;
	}
	/**
	 * @param store the store to set
	 */
	public void setStore(Store store) {
		this.store = store;
	}
	/**
	 * @return the priceLomadee
	 */
	public Double getPriceLomadee() {
		return priceLomadee;
	}
	/**
	 * @param priceLomadee the priceLomadee to set
	 */
	public void setPriceLomadee(Double priceLomadee) {
		this.priceLomadee = priceLomadee;
	}
	/**
	 * @return the linkLomadee
	 */
	public String getLinkLomadee() {
		return linkLomadee;
	}
	/**
	 * @param linkLomadee the linkLomadee to set
	 */
	public void setLinkLomadee(String linkLomadee) {
		this.linkLomadee = linkLomadee;
	}
	/**
	 * @return the installment
	 */
	public Installment getInstallment() {
		return installment;
	}
	/**
	 * @param installment the installment to set
	 */
	public void setInstallment(Installment installment) {
		this.installment = installment;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the ocb
	 */
	public Boolean getOcb() {
		return ocb;
	}
	/**
	 * @param ocb the ocb to set
	 */
	public void setOcb(Boolean ocb) {
		this.ocb = ocb;
	}
	/**
	 * @return the bpmais
	 */
	public Boolean getBpmais() {
		return bpmais;
	}
	/**
	 * @param bpmais the bpmais to set
	 */
	public void setBpmais(Boolean bpmais) {
		this.bpmais = bpmais;
	}
	/**
	 * @return the freeshipping
	 */
	public Boolean getFreeshipping() {
		return freeshipping;
	}
	/**
	 * @param freeshipping the freeshipping to set
	 */
	public void setFreeshipping(Boolean freeshipping) {
		this.freeshipping = freeshipping;
	}


}
