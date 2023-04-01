package com.example.bumblebeecompanymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import com.example.bumblebeecompanymanagement.Domain.Order;
import com.example.bumblebeecompanymanagement.Repository.OrderService;


@Controller
public class OrderController {
	@Autowired
	  private OrderService service;
	 
@GetMapping("/Order")
public String viewHomePage(Model model) {
	     List<Order> listorder = service.listAll();
	     model.addAttribute("listorder",listorder);
	 	model.addAttribute("order",new Order());
	         System.out.print("Get /");
   return "Order";
	    }
	    
	  
}
