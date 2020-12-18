package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.User;
import com.example.services.UserService;
@RestController
public class UserCont implements BaseRestController<User,Long>{
@Autowired
private UserService service;
	
@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> getAll() {
	 return service.getAll();
	}

@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public User get(@PathVariable("id") Long id) {
	 return service.get(id);
	}

@RequestMapping(value = "/user", method = RequestMethod.POST)
	public User create(@RequestBody User res) {
	  return service.create(res);
	}

@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	public User update(@PathVariable("id") Long id,@RequestBody  User res) {
	   return service.update(id, res);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
		
	}

}
