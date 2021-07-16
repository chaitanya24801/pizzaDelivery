package com.example.demo.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Admin;

public interface AdminRepositry extends JpaRepository<Admin, Integer>{
	
	

}
