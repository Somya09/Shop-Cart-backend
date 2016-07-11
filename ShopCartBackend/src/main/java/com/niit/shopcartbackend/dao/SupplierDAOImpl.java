package com.niit.shopcartbackend.dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.niit.shopcartbackend.model.*;
@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	

	@Autowired
	private SessionFactory sessionFactory;


	@Transactional
	public List<Supplier> list() {
		@SuppressWarnings("unchecked")
		List<Supplier> list = (List<Supplier>) sessionFactory.openSession()
				.createCriteria(Supplier.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;
	}

	@Transactional
	public void saveOrUpdate(Supplier supplier) {
		sessionFactory.openSession().saveOrUpdate(supplier);
	}

	@Transactional
	public void delete(String id) {
		Supplier supplier = new Supplier();
		supplier.setId(id);
		sessionFactory.openSession().delete(supplier);
	}

	@Transactional
	public Supplier get(String id) {
		String hql = "from Supplier where id=" + id;
		Query query = sessionFactory.openSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Supplier> list = (List<Supplier>) query.list();
		
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		
		return null;
	}
	@Transactional
	public Supplier getByName(String name){
		String hql = "from Supplier where name = '"+name+"'";
		Query query = sessionFactory.openSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List <Supplier> list = (List<Supplier>) query.list();
		if(list!=null && !list.isEmpty()){
			return list.get(0);
		}
		return null;
	}
	

}

