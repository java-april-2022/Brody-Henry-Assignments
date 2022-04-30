package com.brody.travel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brody.travel.models.Expense;
import com.brody.travel.repositories.ExpenseRepo;

	@Service
	public class ExpenseService {

		@Autowired
		private ExpenseRepo expRepo;
		
		//find all arts
		public List<Expense> getAllExpenses() {
			//Business logic
			return expRepo.findAll();
		}
			
		//create new art
		public Expense createExpense(Expense expense) {
			return expRepo.save(expense);
		}
		
		//update art
		public Expense updateExpense(Expense expense) {
			return expRepo.save(expense);
		}
		//delete art
		public void deleteExpense(Long id) {
			Optional<Expense> optionalExpense = expRepo.findById(id);
			if(optionalExpense.isPresent()) {
				expRepo.deleteById(id);
			}
		}
}
