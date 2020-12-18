package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Admin;
import com.example.repository.AdminRepository;

@Service
public class AdminService implements BaseRestService<Admin,Long> {
@Autowired
private AdminRepository repository;
	@Override
	public List<Admin> getAll() {
		List<Admin> admins = new ArrayList<>();
		repository.findAll().forEach(admins::add);
		return admins;
	}

	@Override
	public Admin get(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public Admin create(Admin res) {
		return repository.save(res);
	}

	@Override
	public Admin update(Long id, Admin res) {
		res.setId(id);
		return repository.save(res);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

}
