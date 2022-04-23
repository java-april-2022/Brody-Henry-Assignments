package com.brody.daikichi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//@RequestMapping("/daikichi")
public class controller {
	
	@RequestMapping("/")
	public String howdy() {
		return "Howdy there partner";
	}

	@RequestMapping("/scary")
	public String scary() {
		return "You find a snake in your boot";
	}

	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable String city) {
		return city + "sure aint as good as the wild west, but it'll do.";
	}

	@RequestMapping("/lotto/{luckynum}")
	public String lotto(@PathVariable int luckynum) {
		if (luckynum % 2 == 0) {
			return "boy howdy, You will take a grand journey in the near future, but be weary of tempting offers";
		} else {
			return "yee haww, You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}

	}

}
