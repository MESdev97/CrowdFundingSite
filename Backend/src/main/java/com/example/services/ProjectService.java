package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Project;
import com.example.repository.ProjectRepository;
@Service
public class ProjectService implements BaseRestService<Project,Long> {

	@Autowired
	private ProjectRepository repository;
	@Override
	public List<Project> getAll() {
		List<Project> projets = new ArrayList<>();
		repository.findAll().forEach(projets::add);
		return projets;
	}

	@Override
	public Project get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Project create(Project res) {
		return repository.save(res);
	}

	@Override
	public Project update(Long id, Project res) {
		res.setId(id);
		return repository.save(res);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}
