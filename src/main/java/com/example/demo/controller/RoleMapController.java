package com.example.demo.controller;

import com.example.demo.dao.RoleMapRepository;
import com.example.demo.pojo.RoleMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleMapController {

    @Autowired
    private RoleMapRepository roleMapRepository;

    @RequestMapping("/get")
    public List<RoleMap> get(){
        return roleMapRepository.findAll();
    }

}
