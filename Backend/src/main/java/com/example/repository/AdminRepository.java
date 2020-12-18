package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Admin;

public interface AdminRepository extends CrudRepository<Admin,Long> {

}
