package com.example.bumblebeecompanymanagement;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import com.example.bumblebeecompanymanagement.Controller.ProductController;
import com.example.bumblebeecompanymanagement.Domain.Product;
import org.junit.Test;

public class AddProduct {


	
@Test
	
	public void testAdd() {
	    // Create a new instance of the ProductController class
	    ProductController controller = new ProductController();

	    // Create a new instance of the Model class
	    Model model = new ConcurrentModel();

	    // Call the add method
	    String viewName = controller.add(model);

	    // Verify that the add method returns the expected view name
	    assertEquals("addproduct", viewName);

	    // Verify that the model contains the expected attributes
	    assertTrue(model.containsAttribute("product"));

	    Product product = (Product) model.getAttribute("product");
	    assertNotNull(product);
	}

	
}
