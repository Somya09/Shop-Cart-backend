package com.niit.shopcartbackend.dao;

import java.util.List;

import com.niit.shopcartbackend.model.Product;

public interface ProductDAO {
public List<Product> list();
public Product get(String id);
public Product getByName(String name);
public void saveOrUpdate(Product product);
public void delete(String id);
}
