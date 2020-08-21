package com.dxctraining.inventorymgt.item.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.inventorymgt.exceptions.InvalidArgumentException;
import com.dxctraining.inventorymgt.item.dao.IItemDao;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;

@Transactional
@Service
public class ItemServiceImpl implements IItemService {
	@Autowired
	private IItemDao dao;

	@Override
	public Item addItem(Item item) {
		item = dao.addItem(item);
		return item;
	}

	@Override
	public void remove(int id) {
		validate(id);
		dao.remove(id);
	}

	@Override
	public Item findItemById(int id) {
		validate(id);
		Item item = dao.findItemById(id);
		return item;
	}

	public void validate(Object arg) {
		if (arg == null) {
			throw new InvalidArgumentException("argument is null");
		}
	}
	
	@Override
	public List<Item> allItems() {
		List<Item>item=dao.allItems();
        return item;
	}

}