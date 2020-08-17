package com.dxctraining.inventorymgt.computer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.inventorymgt.computer.dao.IComputerDao;
import com.dxctraining.inventorymgt.computer.entities.Computer;
import com.dxctraining.inventorymgt.exceptions.InvalidArgumentException;

@Transactional
@Service
public class ComputerServiceImpl implements IComputerService {
	@Autowired
	private IComputerDao dao;

	@Override
	public Computer findPhoneById(int id) {
		Computer computer = dao.findComputerById(id);
		return computer;
	}

	@Override
	public Computer addComputer(Computer computer) {
		validate(computer);
		computer = dao.addComputer(computer);
		return computer;
	}

	@Override
	public void remove(int id) {
		dao.remove(id);
	}

	public void validate(Object arg) {
		if (arg == null) {
			throw new InvalidArgumentException("argument is null");
		}
	}

}