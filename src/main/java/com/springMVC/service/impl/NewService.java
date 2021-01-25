package com.springMVC.service.impl;

import com.springMVC.dao.ICategoryDAO;
import com.springMVC.dao.INewDAO;
import com.springMVC.model.NewModel;
import com.springMVC.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class NewService implements INewService {
	
	@Autowired
	private INewDAO newDao;

	@Override
	public List<NewModel> findAll() {
		return newDao.findAll();
	}



}
