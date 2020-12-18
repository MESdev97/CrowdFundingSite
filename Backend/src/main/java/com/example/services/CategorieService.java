package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Categorie;

import com.example.repository.CategorieRepository;

@Service
public class CategorieService implements BaseRestService<Categorie,Long> {
@Autowired
private CategorieRepository repository;
	@Override
	public List<Categorie> getAll() {
		List<Categorie> categorie = new ArrayList<>();
		repository.findAll().forEach(categorie::add);
		return categorie;
	}

	@Override
	public Categorie get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Categorie create(Categorie res) {
		return repository.save(res);
	}
	

	@Override
	public Categorie update(Long id, Categorie res) {
		res.setId(id);
		return repository.save(res);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}
