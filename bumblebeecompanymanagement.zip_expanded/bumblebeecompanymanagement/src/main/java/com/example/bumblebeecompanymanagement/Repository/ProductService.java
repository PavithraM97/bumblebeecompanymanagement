package com.example.bumblebeecompanymanagement.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bumblebeecompanymanagement.Domain.Product;
import com.example.bumblebeecompanymanagement.Service.ProductRepository;

@Service
public class ProductService {

	@Autowired
	
    private ProductRepository repo;
public List<Product> listAll() {
        return repo.findAll();
    }
    
    public void save(Product product) {
        repo.save(product);
    }
    
    public Product get(long id) {
        return repo.findById(id).get();
    }
    
    public void delete(long id) {
        repo.deleteById(id);
    }
 
}
