package com.brody.assignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brody.assignment.models.Dojo;
import com.brody.assignment.repo.DojoRepository;

@Service
public class DojoService {
	
	@Autowired 
	private DojoRepository repository;
	
	public List<Dojo> all() {
		return this.repository.findAll();
	}
	
	public void create(Dojo dojo) {
		repository.save(dojo);
	}
	
	public void delete(Long id) {
		this.repository.deleteById(id);
	}
	
	public Dojo retrieve(Long id) {
		return this.repository.findById(id).orElse(null);
	}
	public Dojo save(Dojo dojo) {
		return this.repository.save(dojo);
	}
	

}