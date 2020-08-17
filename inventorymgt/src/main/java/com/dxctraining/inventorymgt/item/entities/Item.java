package com.dxctraining.inventorymgt.item.entities;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

@Inheritance(strategy= InheritanceType.JOINED)
@Entity
@Table(name="items")
public class Item {
	@Id
	private int id;
	private String name;
	@ManyToOne
	private Supplier supplier;
	
	public Item(int id,String name,Supplier supplier) {
		this.id=id;
		this.name=name;
		this.supplier=supplier;
	}
	Item(){
		this(00,"",null);
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
