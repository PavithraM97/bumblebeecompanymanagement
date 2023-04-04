package com.example.bumblebeecompanymanagement;

import static org.junit.Assert.*;
import com.example.bumblebeecompanymanagement.Controller.ProductController;
import com.example.bumblebeecompanymanagement.Domain.Product;
import org.junit.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;


class Updateproduct {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
//	
	
	@Test
	public void testShowEditProductPage() {
	    // Create a new instance of the ProductController class
	    ProductController controller = new ProductController();

	    // Call the showEditProductPage method with a valid pid value
	    long id = 1L;
	    ModelAndView mav = controller.showEditProductPage((int) id);

	    // Verify that the method returns a ModelAndView object with the expected view name and model attributes
	    assertEquals("new", mav.getViewName());
	    assertNotNull(mav.getModel());
	    assertTrue(mav.getModel().containsKey("product"));
	    assertEquals(Long.valueOf(id), Long.valueOf(((Product)mav.getModel().get("product")).getId()));
	}


}
