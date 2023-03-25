package com.example.bumblebeecompanymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import com.example.bumblebeecompanymanagement.Domain.Customer;
import com.example.bumblebeecompanymanagement.Domain.Product;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.bumblebeecompanymanagement.Repository.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	  private CustomerService service;
	 
  @GetMapping("/Customer")
  public String viewHomePage(Model model) {
	     List<Customer> listcustomer = service.listAll();
	     model.addAttribute("listcustomer",listcustomer);
	 	model.addAttribute("customer",new Customer());
	         System.out.print("Get /");
     return "Customer";
	    }
	    
	    @GetMapping("/addcustomer")
	    public String add (Model model) {
	    	List<Customer>listcustomer=service.listAll();
	    	model.addAttribute("listcustomer",listcustomer);
	    	model.addAttribute("customer",new Customer());
	    	return "addcustomer";
	    }
	    
//	    
//	    @RequestMapping(value = "/save", method = RequestMethod.POST)
//	    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
//	        service.save(customer);
//	        return "redirect:/addcustomer";
//	    }
}
