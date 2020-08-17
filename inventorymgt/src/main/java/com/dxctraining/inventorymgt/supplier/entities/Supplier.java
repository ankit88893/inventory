package com.dxctraining.inventorymgt.supplier.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="suppliers")
public class Supplier {
	
	@Id
	//@GeneratedValue
	private int id;
	private String name;
	
	public Supplier(int id,String name){
		this.id=id;
		this.name=name;
	}
	Supplier(){
		this(00,"");
	}

	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Supplier that = (Supplier) o;
        return id == that.id;
		
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}