package com.dxctraining.inventorymgt.supplier.dao;

import java.util.List;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

public interface ISupplierDao {
	
	Supplier findSupplierById(int id);

	Supplier add(Supplier supplier);

	void remove(int id);

	List<Supplier> allSuppliers();

}