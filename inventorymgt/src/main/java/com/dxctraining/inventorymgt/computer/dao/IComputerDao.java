package com.dxctraining.inventorymgt.computer.dao;

import java.util.List;

import com.dxctraining.inventorymgt.computer.entities.Computer;

public interface IComputerDao {
	
	Computer findComputerById(int id);

	List<Computer> allComputers();
}