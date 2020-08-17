package com.dxctraining.inventorymgt.computer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import com.dxctraining.inventorymgt.computer.entities.Computer;

@Repository
public class ComputerDaoImpl implements IComputerDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Computer findComputerById(int id) {
		Computer computer = entityManager.find(Computer.class, id);
		
		return computer;
	}

	@Override
	public Computer addComputer(Computer computer) {
		entityManager.persist(computer);
		return computer;
	}

	@Override
	public void remove(int id) {
		Computer computer = findComputerById(id);
		entityManager.remove(computer);
	}
}