package com.dxctraining.inventorymgt.phone.dao;


import java.util.List;

import com.dxctraining.inventorymgt.phone.entities.Phone;

public interface IPhoneDao  {
	
	Phone findPhoneById(int id);

	List<Phone> allPhones();

}