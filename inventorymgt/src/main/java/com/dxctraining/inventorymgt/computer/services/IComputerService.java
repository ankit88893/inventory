package com.dxctraining.inventorymgt.computer.services;

import com.dxctraining.inventorymgt.computer.entities.Computer;

public interface IComputerService {

	Computer findPhoneById(int id);

	Computer addComputer(Computer computer);

	void remove(int id);
}