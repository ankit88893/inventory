  
package com.dxctraining.inventorymgt.supplier.services;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

public interface ISupplierService {
	
	Supplier findSupplierById(int id);

    Supplier add(Supplier supplier);

    void remove(int id);

}