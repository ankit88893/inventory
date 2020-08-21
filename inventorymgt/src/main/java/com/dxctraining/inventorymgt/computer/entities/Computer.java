package com.dxctraining.inventorymgt.computer.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;

@Entity
@Table(name = "computers")
public class Computer extends Item {

	private String diskSize;

	public Computer() {}
	
	public Computer(String name,Supplier supplier, String diskSize) {
		super( name,supplier);
		this.diskSize = diskSize;
	}

	public String getDiskSize() {
		return diskSize;
	}

	public void setDiskSize(String diskSize) {
		this.diskSize = diskSize;
	}

}