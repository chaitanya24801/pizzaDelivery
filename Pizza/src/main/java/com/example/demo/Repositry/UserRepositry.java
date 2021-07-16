package com.example.demo.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.User;

public interface UserRepositry extends JpaRepository<User, Integer> {
	

}
