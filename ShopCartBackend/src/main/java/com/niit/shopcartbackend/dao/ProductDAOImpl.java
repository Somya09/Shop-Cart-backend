package com.niit.shopcartbackend.dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shopcartbackend.model.Product;

@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO {
@Autowired
private SessionFactory sessionFactory;
@Transactional
public List<Product> list() {
	@SuppressWarnings("unchecked")
	List<Product> list = (List<Product>) sessionFactory.openSession().createCriteria(Product.class)
	.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	//Iterator itr = list.iterator();
	for(Product pro : list){
		System.out.println(pro);
	}
	return list;
}

@Transactional
public Product get(String id) {
	String hql  = "from Product where id='"+id+"'";
	Query query = sessionFactory.openSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<Product> list = (List<Product>) query.list();
	if(list!=null && !list.isEmpty()){
		return list.get(0);
	}
	return null;
}
@Transactional
public Product getByName(String name) {
	String hql  = "from Product where name='"+name+"'";
	Query query = sessionFactory.openSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	List<Product> list = (List<Product>) query.list();
	if(list!=null && !list.isEmpty()){
		return list.get(0);
	}
	return null;
}
@Transactional
public void saveOrUpdate(Product product) {
	sessionFactory.openSession().saveOrUpdate(product);
}

@Transactional
public void delete(String id) {
	Product product = new Product();
	product.setId(id);
	sessionFactory.openSession().delete(product);
}
}
