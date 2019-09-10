package com.example.demo.controller;

import com.example.demo.dao.UserMapRepository;
import com.example.demo.pojo.UserMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserMapController {

    @Autowired
    private UserMapRepository userMapRepository;

    @RequestMapping("/get2")
    public List<UserMap> get2(){
        return userMapRepository.findAll();
    }
}
