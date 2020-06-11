package com.abhisek.gateway.object;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class ItemDetails {

	@Id
	@Column(name = "id_item")
	private String idItem;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_item", insertable = false, updatable = false)
	private ItemUpc itemUpc;
//
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_item", insertable = false, updatable = false)
	private ItemImage itemImage;

	@Column(name = "nm_item")
	private String itemName;

	@Column(name = "des_item")
	private String itemDesc;

	@Column(name = "price")
	private Float itemPrice;

	@Column(name = "fl_discount")
	private String disc;

	@Column(name = "UOM")
	private String uom;

	@Column(name = "status")
	private String status;

	@Column(name = "style")
	private String style;

	@Column(name = "ag_restricted")
	private int resctricted;

	@Column(name = "taxed")
	private String taxed;

	@Column(name = "type")
	private String type;

	@Column(name = "id_store")
	private int idStore;

	public ItemUpc getItemUpc() {
		return itemUpc;
	}

	public void setItemUpc(ItemUpc itemUpc) {
		this.itemUpc = itemUpc;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public Float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getDisc() {
		return disc;
	}

	public void setDisc(String disc) {
		this.disc = disc;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public int getResctricted() {
		return resctricted;
	}

	public void setResctricted(int resctricted) {
		this.resctricted = resctricted;
	}

	public String getTaxed() {
		return taxed;
	}

	public void setTaxed(String taxed) {
		this.taxed = taxed;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getIdStore() {
		return idStore;
	}

	public void setIdStore(int idStore) {
		this.idStore = idStore;
	}

	public String getIdItem() {
		return idItem;
	}

	public void setIdItem(String idItem) {
		this.idItem = idItem;
	}

	public ItemImage getItemImage() {
		return itemImage;
	}

	public void setItemImage(ItemImage itemImage) {
		this.itemImage = itemImage;
	}

}
