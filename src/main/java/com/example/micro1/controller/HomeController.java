package com.example.micro1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/sales")
public class HomeController {

	@GetMapping("/getalldata")
	public String getAllData(Model model) {
		return "index";
	}
	

}
