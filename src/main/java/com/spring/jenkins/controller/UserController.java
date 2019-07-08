package com.spring.jenkins.controller;

import java.util.List;

import com.spring.jenkins.model.User;
import com.spring.jenkins.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {
    @Autowired
    private UserRepository repo;

    @GetMapping("/users")
    public List<User> getUsers() {
        return repo.findAll();
    }
}