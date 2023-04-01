package com.example.bumblebeecompanymanagement.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bumblebeecompanymanagement.Domain.Order;
import com.example.bumblebeecompanymanagement.Service.OrderRepository;


@Service
public class OrderService {
	@Autowired
	
    private OrderRepository repo;
public List<Order> listAll() {
        return repo.findAll();
    }

}
