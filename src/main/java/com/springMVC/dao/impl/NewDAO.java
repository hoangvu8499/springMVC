package com.springMVC.dao.impl;

import com.springMVC.dao.INewDAO;
import com.springMVC.mapper.NewMapper;
import com.springMVC.model.NewModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {

    @Override
    public List<NewModel> findAll() {
        StringBuilder sql = new StringBuilder("SELECT * FROM news");
        return query(sql.toString(), new NewMapper());
    }

}
