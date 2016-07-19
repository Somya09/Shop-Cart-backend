package com.niit.shopcartbackend.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shopcartbackend.model.Address;

public class AddressDAOImpl {
@Autowired
private SessionFactory sessionFactory;

@Transactional
public void saveOrUpdate(Address address){
	sessionFactory.openSession().saveOrUpdate(address);
}
}
