package com.dxctraining.inventorymgt.supplier.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.exceptions.SupplierNotFoundException;

@Repository
public class SupplierDaoImpl implements ISupplierDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Supplier findSupplierById(int id) {
		Supplier supplier = entityManager.find(Supplier.class, id);
		if (supplier == null) {
			throw new SupplierNotFoundException("supplier not found for id=" + id);
		}
		return supplier;
	}

	@Override
	public Supplier add(Supplier supplier) {
		entityManager.persist(supplier);
		return supplier;
	}

	@Override
	public void remove(int id) {
		Supplier supplier = findSupplierById(id);
		entityManager.remove(supplier);
	}

}