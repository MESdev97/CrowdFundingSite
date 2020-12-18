package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Contribution;
import com.example.repository.ContributionRepository;
@Service
public class ContributionService implements BaseRestService<Contribution,Long> {
@Autowired
private ContributionRepository repository;
	
	@Override
	public List<Contribution> getAll() {
		List<Contribution> contribution = new ArrayList<>();
		repository.findAll().forEach(contribution::add);
		return contribution;
	}

	@Override
	public Contribution get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Contribution create(Contribution res) {
		return repository.save(res);
	}

	@Override
	public Contribution update(Long id, Contribution res) {
		res.setId(id);
		return repository.save(res);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}
