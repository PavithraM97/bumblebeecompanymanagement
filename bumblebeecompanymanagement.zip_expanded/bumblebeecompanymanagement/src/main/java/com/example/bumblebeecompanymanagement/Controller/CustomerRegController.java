package com.example.bumblebeecompanymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.bumblebeecompanymanagement.Domain.CustomerReg;
import com.example.bumblebeecompanymanagement.Repository.CustomerRegService;


@Controller
//@RequestMapping ("/customerreg")
public class CustomerRegController {

	@Autowired
	  private CustomerRegService service;
	 
// @GetMapping("/CustomerReg")
// public String viewHomePage(Model model) {
//     List<CustomerReg> listcustomerreg = service.listAll();
//     model.addAttribute("listcustomerreg", listcustomerreg);
//         System.out.print("Get /");
//    return "CustomerReg";
//    }
//	    
	    @GetMapping("/CustomerReg")
	    public String add (Model model) {
	    	List<CustomerReg>listcustomerreg=service.listAll();
	    	model.addAttribute("listcustomerreg",listcustomerreg);
	       model.addAttribute("customerreg",new CustomerReg());
	    	//System.out.print("Get / ");
	    	return "CustomerReg";
	    }
	    
	 
	    @RequestMapping(value = "/register", method = RequestMethod.POST)
	    public String saveCustomer(@ModelAttribute("customerreg") CustomerReg customerreg) {
	        service.saveallcus(customerreg);
	        return "redirect:/CustomerReg";
	    }
	 

	    
}
