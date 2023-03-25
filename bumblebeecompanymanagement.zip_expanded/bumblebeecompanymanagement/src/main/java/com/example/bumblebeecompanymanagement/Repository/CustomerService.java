package com.example.bumblebeecompanymanagement.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bumblebeecompanymanagement.Domain.Customer;
import com.example.bumblebeecompanymanagement.Domain.Product;
import com.example.bumblebeecompanymanagement.Service.CustomerRepository;


@Service
public class CustomerService {
	@Autowired
	
    private CustomerRepository repo;
public List<Customer> listAll() {
        return repo.findAll();
    }


//public void save(Customer customer) {
//    repo.save(customer);
//}
}
