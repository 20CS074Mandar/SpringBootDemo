package com.demo.springbootdemo.controller;

import com.demo.springbootdemo.model.Employee;
import com.demo.springbootdemo.model.User;
import com.demo.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

//    @PostMapping
//    public Employee save(@RequestBody Employee employee) {
//        return employeeService.save(employee);
//    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        System.out.println("------------------------------------- Called Saved Employee --------------------------");
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(id);
    }


}
