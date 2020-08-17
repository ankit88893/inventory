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

		Supplier supplier1 = new Supplier(4, "ankit");
		Supplier supplier2 = new Supplier(7, "goku");

		supplierService.add(supplier1);
		supplierService.add(supplier2);

		  Item item1 = new Item(1, "canon", supplier1);
		  Item item2 = new Item(2, "hp", supplier2);

		itemService.addItem(item1);
		itemService.addItem(item2);

		

		Phone ph1 = new Phone(245, "xiamo", supplier1, 1222);
		phoneService.add(ph1);
		Phone ph2 = new Phone(22, "nokia", supplier2, 1283434);
		phoneService.add(ph2);

		int id1 = item1.getId();
		Item itemFetched1 = itemService.findItemById(id1); 
		System.out.println("id is"+itemFetched1.getId()+"name is"+itemFetched1.getName());
	}
}









