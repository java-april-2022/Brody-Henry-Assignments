package com.brody.travel.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.brody.travel.models.Expense;
import com.brody.travel.services.ExpenseService;

@Controller
public class ExpenseController {

		@Autowired
		private ExpenseService expservice;
		
		@GetMapping("/")
		public String home() {
			return "redirect:/expenses";
		}
	
		@GetMapping("/expenses")
		public String index(@ModelAttribute("expense") Expense expense, Model expModel) {
			List<Expense> expenses = expservice.getAllExpenses();
			expModel.addAttribute("allExp", expenses);
			return "expense.jsp";
		}
			
		@PostMapping("/expenses")
		public String index(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
			if(result.hasErrors()) {
				List<Expense> expenses = expservice.getAllExpenses();
				model.addAttribute("expenses", expenses);
				return "expense.jsp";
			}
				expservice.createExpense(expense);
				return "redirect:/expenses";	
		}

}
