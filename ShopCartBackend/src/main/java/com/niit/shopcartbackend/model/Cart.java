package com.niit.shopcartbackend.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="CART")
@Component
public class Cart {
	@Id
	@Column(name="Cart_id")
private String cartId;
	
	@OneToOne
	@JoinColumn(name="Id",nullable=false,updatable=false,insertable=false)
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@OneToMany
	
	@JoinColumn(name="Item_id",nullable=false,updatable=false,insertable=false)
	List<Item> item;
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
}
