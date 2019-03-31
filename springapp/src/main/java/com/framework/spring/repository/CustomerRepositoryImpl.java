package com.framework.spring.repository;

import com.framework.spring.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
  @Override
  public List<Customer> findAll() {
    List<Customer> customers = new ArrayList<>();

    customers.add(Customer.builder()
            .firstName("John")
            .lastName("Dean")
            .build());

    return customers;
  }
}

