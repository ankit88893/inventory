package com.dxctraining.inventorymgt.item.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

@Table(name = "items")
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Item {
	@Id
	@GeneratedValue
	private int id;
	private String name;

	@ManyToOne
	private Supplier supplier;

	public Item() {
	}

	public Item(String name, Supplier supplier) {
		this.name = name;
		this.supplier = supplier;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}