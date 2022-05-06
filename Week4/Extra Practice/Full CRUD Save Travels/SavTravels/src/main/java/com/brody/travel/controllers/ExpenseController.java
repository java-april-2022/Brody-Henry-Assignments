package com.brody.travel.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.brody.travel.models.Expense;
import com.brody.travel.services.ExpenseService;


@Controller
public class ExpenseController {
	
		@Autowired
		private ExpenseService expenseService;
//			Show all 
			@GetMapping("/")
			public String index(Model expModel) {
				List<Expense> expenses= expenseService.all();
				expModel.addAttribute("allExpenses",expenses);
				return "index.jsp";
			}
			
//			Add Expense(get/post)
			
			@GetMapping("/new")
			public String newExpense(@ModelAttribute("newExpense") Expense newExpense) {
				return "new.jsp";
			}
			@PostMapping("/create")
			public String createExpense(@Valid @ModelAttribute("newExpense") Expense newExpense, BindingResult results) {
				if(results.hasErrors()) {
					return "new.jsp";
				}
				expenseService.create(newExpense);
				return "redirect:/";
			}
			
//			Update Expense(get/put)
			@GetMapping("/edit/{id}")
			public String editExpense(@PathVariable Long id, Model model) {
				Expense editExpense=expenseService.retrieve(id);
				model.addAttribute("editExpense", editExpense);
				return "edit.jsp";
					
			}
			
			@PutMapping("/update/{id}")
			public String updateExpense(@ModelAttribute("editExpense") Expense editedExpense, @PathVariable Long id) {
				expenseService.save(editedExpense);
				return "redirect:/";
			}
			
			
			@DeleteMapping("/delete/{id}")
			public String deleteExpense(@PathVariable Long id) {
				expenseService.delete(id);
				return "redirect:/";
				
			}
			
			@GetMapping("retrieve/{id}")
			public String retrieve(@PathVariable Long id, Model model) {
				Expense expense= expenseService.retrieve(id);
				model.addAttribute("expense",expense);
				return "show.jsp";
			}
		}
