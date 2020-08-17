package com.dxctraining.inventorymgt.item.dao;
import com.dxctraining.inventorymgt.item.entities.Item;

public interface IItemDao {
	
	 Item addItem(Item item);
	 
	 void remove(int id);
	 
	 Item findItemById(int id);
	 
}
