package com.niit.shopcartbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "SUPPLIER")
@Component
public class Supplier {
	@Id
	@Column(name="Supplier_id")
	private String id;
	@Column(name="Name")
	@Size(min=3,max=20,message="Name should be between 3 and 30 characters")
	private String name;
	@Column(name="Address")
	@NotEmpty
		private String address;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Supplier [id=" + id + ", name=" + name + ", address=" + address + "]";
}
	
}
