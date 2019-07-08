package com.spring.jenkins.repository;

import com.spring.jenkins.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByFirstName(String firstName);
    User findByLastName(String lastName);
    User findByFirstNameLike(String firstNameLike);
}