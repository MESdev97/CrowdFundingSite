package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Categorie;
import com.example.services.CategorieService;

@RestController
public class CategorieCont implements BaseRestController<Categorie,Long> {
	@Autowired
	private CategorieService service;

	 @RequestMapping(value = "/categorie", method = RequestMethod.GET)
	public List<Categorie> getAll() {
		 return service.getAll();
	}

	 @RequestMapping(value = "/categorie/{id}", method = RequestMethod.GET)
	public Categorie get(@PathVariable("id") Long id) {
		// TODO Auto-generated method stub
		 return service.get(id);
	}

	 @RequestMapping(value = "/categorie", method = RequestMethod.POST)
	public Categorie create(@RequestBody Categorie res) {
		 return service.create(res);
	}

	 @RequestMapping(value = "/categorie/{id}", method = RequestMethod.PUT)
	public Categorie update(@PathVariable("id") Long id,@RequestBody  Categorie res) {
		 return service.update(id, res);
	}

	 @RequestMapping(value = "/categorie/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
		
	}
	
}
