package com.berkcorp.springBootDemo.apiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	
	
	@GetMapping("/")
	public String get() {
		return "Laptop";
	}
	
	@GetMapping("/products")
	public String get2() {
		return "Laptop - 51";
	}
	
	@GetMapping("/anil")
	public String get3() {
		return "Çhopra";
	}
	
}
