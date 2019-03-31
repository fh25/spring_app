package com.framework.spring;

import com.framework.spring.config.AppConfig;
import com.framework.spring.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerAppDemo {
  public static void main(String [] args) {
    ApplicationContext appContext =
            new AnnotationConfigApplicationContext(AppConfig.class);
    CustomerService service = appContext.getBean("customerService", CustomerService.class);
    System.out.println(service);

    CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
    System.out.println(service2);

    System.out.println(service.findAll().get(0).getFirstName());

  }
}
