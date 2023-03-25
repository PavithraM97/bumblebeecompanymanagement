package com.example.bumblebeecompanymanagement.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bumblebeecompanymanagement.Domain.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}