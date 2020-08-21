package com.dxctraining.inventorymgt.supplier.services;

import java.util.List;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

public interface ISupplierService {
	
	Supplier findSupplierById(int id);

    Supplier add(Supplier supplier);

    void remove(int id);
    
	List<Supplier> allSuppliers();

	boolean authenticate(int id, String password);


}