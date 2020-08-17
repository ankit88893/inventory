package com.dxctraining.inventorymgt.ui;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.item.services.IItemService;
import com.dxctraining.inventorymgt.phone.entities.Phone;
import com.dxctraining.inventorymgt.phone.services.IPhoneService;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.services.ISupplierService;

@Component
public class ItemUi {

	@Autowired
	private IItemService itemService;
	@Autowired
	private ISupplierService supplierService;

	@Autowired
	private IPhoneService phoneService;

	@PostConstruct
	void runApp() {

		Supplier supplier1 = new Supplier(1, "mohan");
		Supplier supplier2 = new Supplier(2, "sohan");

		supplierService.add(supplier1);
		supplierService.add(supplier2);

		Item item1 = new Item(1, "iphone", supplier1);
		Item item2 = new Item(2, "samsung", supplier2);

		itemService.addItem(item1);
		itemService.addItem(item2);

		System.out.println("******Sprint 3 is working");

		Phone ph1 = new Phone(11, "AAA", supplier1, 64);
		phoneService.add(ph1);
		Phone ph2 = new Phone(22, "BBB", supplier2, 128);
		phoneService.add(ph2);

		int id1 = item1.getId();
		Item itemFetched1 = phoneService.findPhoneById(id1);
		System.out.println("id is" + itemFetched1.getId() + "name is" + itemFetched1.getName());
		int id2 = item2.getId();
		Item itemFetched2 = phoneService.findPhoneById(id2);
		System.out.println("id is" + itemFetched2.getId() + "name is" + itemFetched2.getName());
	}
}









