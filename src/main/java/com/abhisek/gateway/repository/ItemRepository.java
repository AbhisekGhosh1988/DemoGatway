package com.abhisek.gateway.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.abhisek.gateway.object.ItemDetails;

@Repository
public interface ItemRepository extends JpaRepository<ItemDetails, String> {
	 //@Query("select it.nm_item  from item it join item_upc iu on it.id_item=iu.id_item join item_image im on im.id_item=it.id_item where iu.item_upc=(:item_upc)")
	// @Query("select iu.id_item,iu.item_upc from item_upc iu where iu.item_upc=(:item_upc)")
	//ItemDetails findByUpc(@Param("item_upc") String item_upc);

}