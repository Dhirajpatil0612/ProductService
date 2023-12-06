package com.example.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class ProductController {
	
	@GetMapping("/b")
	public String show()
	{
		return "Rohit Sharma";
	}

}
