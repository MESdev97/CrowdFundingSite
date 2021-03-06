package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Project;
import com.example.services.ProjectService;
@RestController
public class ProjectCont implements BaseRestController<Project,Long> {
 @Autowired 
 private ProjectService service;
 @RequestMapping(value = "/projects", method = RequestMethod.GET)
	public List<Project> getAll() {
		// TODO Auto-generated method stub
	 return service.getAll();
	}

 @RequestMapping(value = "/projects/{id}", method = RequestMethod.GET)
	public Project get(@PathVariable("id") Long id) {
	
	 return service.get(id);
	}

 @RequestMapping(value = "/projects", method = RequestMethod.POST)
	public Project create(@RequestBody Project res) {
		
	 return service.create(res);
	}

 @RequestMapping(value = "/projects/{id}", method = RequestMethod.PUT)
	public Project update(@PathVariable("id") Long id, @RequestBody Project res) {
	 return service.update(id, res);
	}

	@RequestMapping(value = "/projects/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
		
	}

}
