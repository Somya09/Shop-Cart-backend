package com.niit.shopcartbackend.dao;
import java.util.List;

import com.niit.shopcartbackend.model.Category;

public interface CategoryDAO {
	
		public List<Category> list();
		public Category getByName(String name);
		public Category get(String id);

		public void saveOrUpdate(Category category);

		public void delete(String id);


	}


