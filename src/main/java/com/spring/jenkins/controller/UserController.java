package com.spring.jenkins.controller;

import java.util.List;

import com.spring.jenkins.model.User;
import com.spring.jenkins.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id")Long id) {
        return repo.findById(id)
        .get();
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User body) {
        User user = new User(body.getFirstName(), body.getLastName());
        return repo.save(user);
    }
}