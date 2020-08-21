package com.dxctraining.inventorymgt.phone.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.exceptions.SupplierNotFoundException;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.phone.entities.Phone;

@Repository
public class PhoneDaoImpl extends Item implements IPhoneDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Phone findPhoneById(int id) {
		Phone phone =(Phone)findPhoneById(id);
		return phone;
	}
	@Override
	public List<Phone> allPhones() {
	      String jpaql="from Phone";
	        TypedQuery<Phone>query=entityManager.createQuery(jpaql,Phone.class);
	        List<Phone> phoneList=query.getResultList();
	        return phoneList;	
	}

}