package com.example.bumblebeecompanymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.bumblebeecompanymanagement.Domain.Product;
import com.example.bumblebeecompanymanagement.Domain.Customer;

import com.example.bumblebeecompanymanagement.Repository.ProductService;

@Controller

public class IndexController {

	
	@Autowired
	private ProductService service;
	
	

	 @RequestMapping(value="/index",method=RequestMethod.GET)
	 public String index()
 {
	 return "index";
 }
	 
 @RequestMapping(value ="/product" , method=RequestMethod.GET)
 public String viewHomePage(Model model)
 {
	 List<Product> listproduct = service.listAll();
	 model.addAttribute("listproduct", listproduct);
		 System.out.print("Get /");
		 return "product";
	 }
 

	 
	 
}
