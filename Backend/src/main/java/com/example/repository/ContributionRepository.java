package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Contribution;

public interface ContributionRepository extends CrudRepository<Contribution,Long>{

}
