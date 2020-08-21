package com.dxctraining.inventorymgt.computer.services;

import java.util.List;

import com.dxctraining.inventorymgt.computer.entities.Computer;

public interface IComputerService {

	Computer findPhoneById(int id);

	List<Computer> allComputers();

}