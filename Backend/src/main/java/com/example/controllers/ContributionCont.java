package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Contribution;
import com.example.services.ContributionService;
@RestController
public class ContributionCont implements BaseRestController<Contribution,Long> {
 @Autowired
 private ContributionService service;
	@RequestMapping(value = "/contribution", method = RequestMethod.GET)
	public List<Contribution> getAll() {
		return service.getAll();
	}

	@RequestMapping(value = "/contribution/{id}", method = RequestMethod.GET)
	public Contribution get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@RequestMapping(value = "/contribution", method = RequestMethod.POST)
	public Contribution create(@RequestBody Contribution res) {
		return service.create(res);
	}

	@RequestMapping(value = "/contribution/{id}", method = RequestMethod.PUT)
	public Contribution update(@PathVariable("id") Long id, @RequestBody Contribution res) {
		return service.update(id, res);
	}

	@RequestMapping(value = "/contribution/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
		
	}

}
