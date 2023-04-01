package com.example.bumblebeecompanymanagement.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bumblebeecompanymanagement.Domain.CustomerReg;



@Repository
public interface CustomerRegRepository extends JpaRepository<CustomerReg, Long>{



}