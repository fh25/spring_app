package com.framework.spring.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
  private String firstName;
  private String lastName;
}
