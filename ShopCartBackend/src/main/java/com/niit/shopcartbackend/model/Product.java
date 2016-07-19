package com.niit.shopcartbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Entity 
@Table(name="PRODUCT")
@Component
public class Product {
	@Id
	@Column(name="Product_id")
	private String id;
	@Column(name="Name")
	@NotNull
	@Size(min=3)
	private String name;
	@Column(name="Description")
	@NotBlank
	@Size(min=3,message="Description should be more than 3 characters")
	private String description;
	@Column(name="Price")
	@Min(value=0)
	private double price;
	@NotNull
	@Column(name="Category_id")
	private String category_id;
	@NotNull
	@Column(name="Supplier_id")
	private String supplier_id;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}
	
	@ManyToOne
	@JoinColumn(name="Category_id", nullable=false, updatable=false, insertable=false)
	private Category category;
	public Category getCategory(){
		return category;
	}
	
	public void setCategory(Category  category){
		this.category = category;
	}
	
	@ManyToOne
	@JoinColumn(name="Supplier_id", nullable=false, updatable=false, insertable=false)
	private Supplier supplier;
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
}
