package com.abhisek.gateway.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhisek.gateway.object.ItemDetails;
import com.abhisek.gateway.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public ItemDetails read(String itemUpc) {
		ItemDetails books = itemRepository.getOne(itemUpc);
		return books;
	}

}
