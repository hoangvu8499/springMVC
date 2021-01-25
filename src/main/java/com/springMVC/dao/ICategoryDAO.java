package com.springMVC.dao;


import com.springMVC.model.CategoryModel;

import java.util.List;

public interface ICategoryDAO extends com.springMVC.dao.GenericDAO<CategoryModel> {
	List<CategoryModel> findAll();
	CategoryModel findOne(long id);
	CategoryModel findOneByCode(String code);
}
