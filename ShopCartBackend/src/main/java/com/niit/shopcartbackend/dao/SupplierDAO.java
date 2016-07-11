package com.niit.shopcartbackend.dao;

import java.util.List;
import com.niit.shopcartbackend.model.Category;
import com.niit.shopcartbackend.model.Supplier;
import com.niit.shopcartbackend.model.*;
public interface SupplierDAO {
	public List<Supplier> list();

	public Supplier get(String id);

	public void saveOrUpdate(Supplier supplier);

	public void delete(String id);
	public Supplier getByName(String name);

}
