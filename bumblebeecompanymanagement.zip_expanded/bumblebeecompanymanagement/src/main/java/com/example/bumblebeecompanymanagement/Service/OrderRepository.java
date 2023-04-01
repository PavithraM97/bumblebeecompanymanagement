package com.example.bumblebeecompanymanagement.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.bumblebeecompanymanagement.Domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}