package com.example.demo.dao;

import com.example.demo.pojo.UserMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMapRepository extends JpaRepository<UserMap,Integer> {
}
