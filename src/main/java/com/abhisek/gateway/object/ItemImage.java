package com.abhisek.gateway.object;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_image")
public class ItemImage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Column(name = "id_item")
	private String itemId;
	
	@Id
	@Column(name = "item_url")
	private String itemUrl;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_item", insertable = false, updatable = false)
	private ItemDetails itemDetails;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemUrl() {
		return itemUrl;
	}

	public void setItemUrl(String itemUrl) {
		this.itemUrl = itemUrl;
	}

	public ItemDetails getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(ItemDetails itemDetails) {
		this.itemDetails = itemDetails;
	}

	
}
