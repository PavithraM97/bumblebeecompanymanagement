package com.example.bumblebeecompanymanagement.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bumblebeecompanymanagement.Domain.CustomerReg;
import com.example.bumblebeecompanymanagement.Service.CustomerRegRepository;



@Service
public class CustomerRegService {


	@Autowired
	
    private CustomerRegRepository repo;
public List<CustomerReg> listAll() {
        return repo.findAll();
    }
    
    public void saveallcus(CustomerReg customerreg) {
        repo.save(customerreg);
    }
}
