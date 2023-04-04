package com.example.bumblebeecompanymanagement;

import static org.junit.Assert.*;
import com.example.bumblebeecompanymanagement.Controller.ProductController;
import com.example.bumblebeecompanymanagement.Domain.Product;
import org.junit.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

class DeleteProduct {


	
	@Test
	public void test() {
		
		    // Create a new instance of the ProductController class
		    ProductController controller = new ProductController();
		    // Call the delete method with a valid pid value
		   
		    String viewName = controller.deleteProductPage((int) 1L);

	    // Verify that the method redirects to the expected URL
	    assertEquals("redirect:/Product", viewName);
		
	}
	

}
