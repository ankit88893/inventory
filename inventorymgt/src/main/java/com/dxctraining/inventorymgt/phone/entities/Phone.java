package com.dxctraining.inventorymgt.phone.entities;

import javax.persistence.Entity;

import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;

@Entity
public class Phone extends Item {

	private int storageSize;
	
	
	public Phone(int id, String name, Supplier supplier, int storageSize) {
		super(id, name, supplier);
		this.storageSize = storageSize;
	}

	public int getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Phone that = (Phone) o;
		return that.getId() == this.getId();
	}

	@Override
	public int hashCode() {
		return this.getId();
	}

}