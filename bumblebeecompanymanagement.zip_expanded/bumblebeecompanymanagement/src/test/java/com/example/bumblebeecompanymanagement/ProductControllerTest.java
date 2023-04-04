package com.example.bumblebeecompanymanagement;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.awt.PageAttributes.MediaType;
import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.bumblebeecompanymanagement.Domain.Product;
import com.example.bumblebeecompanymanagement.Repository.ProductService;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.bumblebeecompanymanagement.Controller.ProductController;
import com.example.bumblebeecompanymanagement.Domain.Product;
import com.example.bumblebeecompanymanagement.Service.ProductRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

//@RunWith(MockitoJUnitRunner.class)
@RunWith(SpringRunner.class)
class ProductControllerTest {
	
	@Autowired
	private ProductService service;
	
	@MockBean
	private ProductRepository repository;
	
	public void saveTest() {
		when(repository.findAll()).thenReturn(Stream.of(new Product (null, "iphone", "hundredthousand" ,"versions are available" ,"mobile device" ,"iphone"), new Product (null, "iphone", "hundredthousand" ,"versions are available" ,"mobile device" ,"iphone"))
				.collect(Collectors.toList()));
		
		assertEquals(2,service.listAll().size());
	}
	
	

//public void findbyidTest() {
//int id= 1;
//when(repository.findById(id)).thenReturn(Stream.of(new Product (null, "iphone", "hundredthousand" ,"versions are available" ,"mobile device" ,"iphone"))
//			.collect(Collectors.toList()));
//assertEquals(1,service.get(id));
//	
//
// Arrange
//    int id = 1;
//   Product product = new Product(1L, "iphone", "hundredthousand", "versions are available", "mobile device", "iphone");
//  when(repository.findById(id)).thenReturn(Stream.of(product).collect(Collectors.toList()));
// Act
////    Product result = service.findById(id);
////
////    // Assert
////    assertEquals(product, result);
////}
	//}
	//
	
	
	
	
	

//	private MockMvc mockmvc;
//	
//	ObjectMapper objectMapper= new ObjectMapper();
//	ObjectWriter objectWriter =  objectMapper.writer();
//	
//	@Mock
//	private ProductRepository productRepository;
//	
//	@InjectMocks
//	private ProductController productController;
//	
//	Product RECORD_1 = new Product (null, "iphone", "hundredthousand" ,"versions are available" ,"mobile device" ,"iphone");
//	Product RECORD_2 = new Product (null, "iphone", "hundredthousand" ,"versions are available" ,"mobile device" ,"iphone");
//	
//	@Before
//	public void setUp() {
//		MockitoAnnotations.initMocks(this);
//		this.mockmvc =MockMvcBuilders.standaloneSetup(productController).build();
//	}
//	
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private ProductService productService;
//
//    @Test
//    public void testViewHomePage() throws Exception {
//        List<Product> products = Arrays.asList(new Product (null, "iphone", "hundredthousand" ,"versions are available" ,"mobile device" ,"iphone"), new Product (null, "apple", "hundredthousand" ,"versions are available" ,"mobile device" ,"iphone"));
//        when(productService.listAll()).thenReturn(products);
//
//        mockmvc.perform(MockMvcRequestBuilders.get("/Product"))
//        .andExpect(MockMvcResultMatchers.status().isOk())
//    .andExpect(MockMvcResultMatchers.view().name("Product"))
//       .andExpect(MockMvcResultMatchers.model().attribute("listproduct", products));
//    }
//    
//    
//   
    
    
//	@Test
//	public void testViewHomePage() throws Exception {
//	    List<Product> records = Arrays.asList(RECORD_1, RECORD_2);
//	    
//	    Mockito.when(productRepository.findAll()).thenReturn(records);
//	    
//	    mockmvc.perform(MockMvcRequestBuilders.get("/Product"))
//	           .andExpect(MockMvcResultMatchers.status().isOk())
//	           .andExpect(MockMvcResultMatchers.view().name("Product"))
//	           .andExpect(MockMvcResultMatchers.model().attribute("listproduct", records));
//	}

//	  @Test
//	    public void testViewHomePage() throws Exception {
//		  List<Product> records = (Arrays.asList(RECORD_1,RECORD_2));
//	  
//	  when(productRepository.findAll()).thenReturn(records);
//        mockmvc.perform(MockMvcRequestBuilders
//        		.get("/product")
//        		.contentType(MediaType.APPLICATION_JSON)
//        		.andExpect(status().isOk()
//       				.andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(2)))
//        			.andExpect(jsonPath("$[1].name", is("iphone"))));
        				
        		
 	
//	               
//	  }

}
