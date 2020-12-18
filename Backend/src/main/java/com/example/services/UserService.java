package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.User;
import com.example.repository.UserRepository;
@Service
public class UserService implements BaseRestService<User,Long>{
   @Autowired
	private UserRepository repository;
	@Override
	public List<User> getAll() {
		List<User> users = new ArrayList<>();
		repository.findAll().forEach(users::add);
		return users;
	}

	@Override
	public User get(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public User create(User res) {
		
		return repository.save(res);
	}

	@Override
	public User update(Long id, User res) {
		res.setId(id);
		return repository.save(res);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}
