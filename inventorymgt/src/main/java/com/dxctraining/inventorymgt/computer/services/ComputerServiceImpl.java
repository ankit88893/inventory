package com.dxctraining.inventorymgt.computer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.inventorymgt.computer.dao.IComputerDao;
import com.dxctraining.inventorymgt.computer.entities.Computer;
import com.dxctraining.inventorymgt.exceptions.InvalidArgumentException;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.phone.entities.Phone;

@Transactional
@Service
public class ComputerServiceImpl extends Item implements IComputerService {
	
	@Autowired
	private IComputerDao dao;

	@Override
	public Computer findPhoneById(int id) {
		Computer computer = dao.findComputerById(id);
		return computer;
	}

	public void validate(Object arg) {
		if (arg == null) {
			throw new InvalidArgumentException("argument is null");
		}
	}
	
	@Override
	public List<Computer> allComputers() {
		List<Computer> allComputer =dao.allComputers();
		return allComputer;
	}

}