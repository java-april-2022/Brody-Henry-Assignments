package com.brody.assignment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brody.assignment.models.Dojo;
import com.brody.assignment.models.Ninja;
import com.brody.assignment.repo.NinjaRepository;



@Service
public class NinjaService {
		
		@Autowired 
		private NinjaRepository repository;
		
		public List<Ninja> all() {
			return this.repository.findAll();
		}
		
		public void create(Ninja ninja) {
			repository.save(ninja);
		}
		
		public void delete(Long id) {
			this.repository.deleteById(id);
		}
		
		public Ninja retrieve(Long id) {
			return this.repository.findById(id).orElse(null);
		}
		public Ninja save(Ninja ninja) {
			return this.repository.save(ninja);
		}
		public List<Ninja> byDojo(Dojo dojo){
			return repository.findAllByDojo(dojo);
		}
}
