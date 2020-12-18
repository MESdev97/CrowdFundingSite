package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Project;

public interface ProjectRepository extends CrudRepository<Project,Long> {

}
