package com.framework.spring.service;

import com.framework.spring.model.Customer;
import com.framework.spring.repository.CustomerRepository;
import com.framework.spring.repository.CustomerRepositoryImpl;

import java.util.List;

//Business logic resides here. Also validation input and output
public class CustomerServiceImpl implements CustomerService {

  private CustomerRepository customerRepository;

  public CustomerServiceImpl(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @Override
  public List<Customer> findAll() {
    return customerRepository.findAll();
  }
}
