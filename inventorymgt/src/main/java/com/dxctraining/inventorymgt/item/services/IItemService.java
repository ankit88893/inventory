package com.dxctraining.inventorymgt.item.services;

import java.util.List;

import com.dxctraining.inventorymgt.item.entities.Item;

public interface IItemService {

	Item addItem(Item item);

	void remove(int id);

	Item findItemById(int id);

	List<Item> allItems();
}