package com.brody.travel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brody.travel.models.Expense;
import com.brody.travel.repo.ExpenseRepo;

@Service
public class ExpenseService {
	
	@Autowired 
	private ExpenseRepo repository;
	
	public List<Expense> all() {
		return this.repository.findAll();
	}
	
	public void create(Expense expense) {
		repository.save(expense);
	}
	
	public void delete(Long id) {
		this.repository.deleteById(id);
	}
	
	public Expense retrieve(Long id) {
		return this.repository.findById(id).orElse(null);
	}
	public Expense save(Expense item) {
		return this.repository.save(item);
	}
}