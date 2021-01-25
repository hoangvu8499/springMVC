package com.springMVC.dao;

import com.springMVC.model.NewModel;
import com.springMVC.paging.Pageble;

import java.util.List;

public interface INewDAO extends GenericDAO<NewModel> {
	List<NewModel> findAll();
}
