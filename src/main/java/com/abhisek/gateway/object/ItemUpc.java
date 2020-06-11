package com.abhisek.gateway.object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item_upc")
public class ItemUpc  {

	
	@Column(name = "item_upc")
	private String item_upc;

	@Id
	@Column(name = "id_item")
	private String id;
	

	public String getItemUpc() {
		return item_upc;
	}
	
	public void setItemUpc(String itemUpc) {
		this.item_upc = itemUpc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}
