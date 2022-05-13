package com.brody.assignment.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.brody.assignment.models.Dojo;
import com.brody.assignment.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);
}
