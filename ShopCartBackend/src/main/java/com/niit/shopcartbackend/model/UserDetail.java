package com.niit.shopcartbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="User_Detail")
@Component
public class UserDetail {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
private String id;
	@Column(name="Name")

private String name;
	@Column(name="Mail_Id")
private String mail_id;
	@Column(name="Address")
private String address;
	@Column(name="Contact_no.")
private String contact_num;
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
public String getMail_id() {
	return mail_id;
}
public void setMail_id(String mail_id) {
	this.mail_id = mail_id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getContact_num() {
	return contact_num;
}
public void setContact_num(String contact_num) {
	this.contact_num = contact_num;
}
}
