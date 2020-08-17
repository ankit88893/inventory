package com.dxctraining.inventorymgt.phone.services;

import com.dxctraining.inventorymgt.phone.entities.Phone;

public interface IPhoneService {

	Phone findPhoneById(int id);

	Phone add(Phone phone);

	void remove(int id);

}