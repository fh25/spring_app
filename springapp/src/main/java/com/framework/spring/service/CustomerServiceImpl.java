package com.framework.spring.service;

import com.framework.spring.model.Customer;
import com.framework.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("singleton") //will default to Singleton but just being clear
public class CustomerServiceImpl implements CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  public CustomerServiceImpl() {}

  public CustomerServiceImpl(CustomerRepository customerRepository) {
    System.out.println("Using Constructor Injection..");
    this.customerRepository = customerRepository;
  }

  @Override
  public List<Customer> findAll() {
    return customerRepository.findAll();
  }
}
