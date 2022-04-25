package com.brody.form.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "OmikujiForm.jsp";
	}
	@RequestMapping("/omikuji")
	public String omikuji() {
		return "OmikujiForm.jsp";
	}
	
	@RequestMapping("/omikuji/results")
	public String results(HttpSession session, Model model) {
		
		String result = (String) session.getAttribute("omikujiResults");
		model.addAttribute("result", result);
		
		return "OmikujiResults.jsp";
	}
	
	@PostMapping("/omikujiPost")
	public String kujiPost(
			@RequestParam(value= "number") int number,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="thing") String thing,
			@RequestParam(value="nice") String nice,
			HttpSession session)
	
	{
		
		String omikujiResults = String.format(
				"In %s years you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s.", number, city, person, hobby, thing, nice);
		
		session.setAttribute("omikujiResults", omikujiResults);
		
		return "redirect:/omikuji/results";
	}

}