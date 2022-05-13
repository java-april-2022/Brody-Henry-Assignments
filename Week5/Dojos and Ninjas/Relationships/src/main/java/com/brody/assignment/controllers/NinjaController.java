package com.brody.assignment.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.brody.assignment.models.Ninja;
import com.brody.assignment.services.DojoService;
import com.brody.assignment.services.NinjaService;

@Controller
public class NinjaController {

	@Autowired
	private NinjaService ninjaService;
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/ninja/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojo",dojoService.all());
		return "Ninja.jsp";
	}
	@PostMapping("/ninja/save")
	public String saveNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		}
		ninjaService.create(ninja);
		return "redirect:/";
	}
}
