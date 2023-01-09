package com.example.micro1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.micro1.models.Sales;


@Controller
@RequestMapping("/sales")
public class HomeController {

	@GetMapping("/getalldata")
	public String getAllData(Model model) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Sales[]> response =
				  restTemplate.getForEntity(
				  "http://localhost:8080/sales/getall",
				  Sales[].class);
				Sales[] listSales = response.getBody();
				
		model.addAttribute("listSales", listSales);
		return "index";
	}
	

}
