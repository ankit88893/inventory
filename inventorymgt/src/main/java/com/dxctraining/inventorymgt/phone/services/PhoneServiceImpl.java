package com.dxctraining.inventorymgt.phone.services;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.inventorymgt.phone.dao.IPhoneDao;
import com.dxctraining.inventorymgt.phone.entities.Phone;
import com.dxctraining.inventorymgt.exceptions.InvalidArgumentException;
import com.dxctraining.inventorymgt.item.entities.Item;

@Transactional
@Service
public class PhoneServiceImpl extends Item implements IPhoneService {
	@Autowired
	private IPhoneDao dao;

	@Override
	public Phone findPhoneById(int id) {
		Phone phone = dao.findPhoneById(id);
		return phone;
	}

	@Override
	public List<Phone> allPhones() {
		List<Phone> allphones = dao.allPhones();
		return allphones;
	}

}