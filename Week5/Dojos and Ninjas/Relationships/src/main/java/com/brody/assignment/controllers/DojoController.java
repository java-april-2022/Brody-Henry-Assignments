package com.brody.assignment.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.brody.assignment.models.Dojo;
import com.brody.assignment.services.DojoService;

@Controller
public class DojoController {
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/dojo/{id}")
	public String showDojo(@PathVariable Long id, Dojo dojo, Model model) {
		dojo = dojoService.retrieve(id);
		model.addAttribute("ninjas", dojoService.all());
		model.addAttribute("dojo", dojo);
		return "index.jsp";
	}
		
	@GetMapping("/dojo")
	public String dojo(@ModelAttribute("newDojo") Dojo newDojo) {
		return "Dojo.jsp";
		
	}
	@PostMapping("/dojo/new")
	public String saveDojo(@Valid @ModelAttribute("newDojo") Dojo newDojo, Model model, BindingResult result) {
		if (result.hasErrors()) {
			List<Dojo> dojos = dojoService.all();
			model.addAttribute("allDojos", dojos);
			return "redirect:/";
		}
		dojoService.create(newDojo);
		return "redirect:/";
	}
}


