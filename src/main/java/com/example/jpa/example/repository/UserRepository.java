package com.example.jpa.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.example.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
