package com.springboot.mysql.controller;

import com.springboot.mysql.entity.User;
import com.springboot.mysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

   @Autowired
    private UserRepository userRepository;

   @GetMapping("/")
    public List<User> getAllUsers(){
       return userRepository.findAll();
   }
}

