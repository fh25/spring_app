package com.framework.spring.repository;

import com.framework.spring.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

  @Value("${dbUsername}")
  private String dbUsername;

  @Override
  public List<Customer> findAll() {
    List<Customer> customers = new ArrayList<>();
    System.out.println("UserName: " + dbUsername);

    customers.add(Customer.builder()
            .firstName("John")
            .lastName("Dean")
            .build());

    return customers;
  }

}

