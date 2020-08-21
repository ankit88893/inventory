package com.dxctraining.inventorymgt.phone.services;

import java.util.List;

import com.dxctraining.inventorymgt.phone.entities.Phone;

public interface IPhoneService {

	Phone findPhoneById(int id);

	List<Phone> allPhones();

}