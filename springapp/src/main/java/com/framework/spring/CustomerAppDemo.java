package com.framework.spring;

import com.framework.spring.service.CustomerService;
import com.framework.spring.service.CustomerServiceImpl;

public class CustomerAppDemo {
  public static void main(String [] args) {
    CustomerService service = new CustomerServiceImpl();
    System.out.println(service.findAll().get(0).getFirstName());
  }
}
