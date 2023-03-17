package com.demo.springbootdemo.service;

import com.demo.springbootdemo.model.Employee;

import java.util.List;

public interface EmployeeService {

    //here we are defining a method that we want to return employee on save
    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getUserById(String id);

    Employee getEmployeeById(String id);

    Employee saveEmployee(Employee employee);
}
