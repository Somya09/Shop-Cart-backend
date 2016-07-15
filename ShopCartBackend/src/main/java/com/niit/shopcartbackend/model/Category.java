package com.niit.shopcartbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Entity
@Table(name="CATEGORY")
@Component
public class Category {
@Id
@Column(name="Category_id")

private String id;
@Column(name="Name")
@Size(min=3,max=50, message="Name should be between 3 and 50 characters")
private String name;
@Size(min=3,message="Description should be more than 3 characters")
@Column(name="Description")
private String description;
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
public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

}
