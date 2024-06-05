package com.employee.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
  @GetMapping("/get")
  public String findAllWithEmployees() {
    return "Avinash";
  }
}