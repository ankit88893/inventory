package com.dxctraining.inventorymgt.computer.dao;

import com.dxctraining.inventorymgt.computer.entities.Computer;

public interface IComputerDao {
	
	Computer findComputerById(int id);

	Computer addComputer(Computer computer);

	void remove(int id);
}