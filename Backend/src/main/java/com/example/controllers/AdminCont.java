package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Admin;
import com.example.services.AdminService;
@RestController
public class AdminCont implements BaseRestController<Admin,Long> {
@Autowired
private AdminService service;
@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public List<Admin> getAll() {
	return service.getAll();
	}

@RequestMapping(value = "/admin/{id}", method = RequestMethod.GET)
	public Admin get(@PathVariable("id") Long id) {
		
		return service.get(id);
	}

@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public Admin create(@RequestBody Admin res) {
	return service.create(res);
	}

@RequestMapping(value = "/admin/{id}", method = RequestMethod.PUT)
	public Admin update(@PathVariable("id") Long id,@RequestBody Admin res) {
		
	return service.update(id, res);
	}

	@RequestMapping(value = "/admin/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
		
	}

}
