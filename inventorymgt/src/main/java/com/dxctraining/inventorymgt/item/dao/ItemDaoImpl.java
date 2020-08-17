package com.dxctraining.inventorymgt.item.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.dxctraining.inventorymgt.item.entities.Item;

@Repository
public class ItemDaoImpl implements IItemDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Item addItem(Item item) {
		entityManager.persist(item);
		return item;
	}

	@Override
	public void remove(int id) {
		Item item = findItemById(id);
		entityManager.remove(item);
	}

	@Override
	public Item findItemById(int id) {
		Item item = entityManager.find(Item.class, id);
		return item;
	}


}
