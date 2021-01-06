package com.springMVC.serviceImpl;

import com.springMVC.service.HomeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public List<String> loadMenu() {
        List<String> menu = new ArrayList<>();
        menu.add("MODEL");
        menu.add("VIEW");
        menu.add("CONTROLLER");
        return menu;
    }
}
