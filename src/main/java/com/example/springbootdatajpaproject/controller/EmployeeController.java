package com.example.springbootdatajpaproject.controller;


import com.example.springbootdatajpaproject.enitity.Employee;
import com.example.springbootdatajpaproject.serives.EmployeeSerives;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeSerives employeeService;

    //inject employeeDAO ny using constructor
    @Autowired
    public EmployeeController(EmployeeSerives employeeService) {

        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);
        if (employee == null)
            throw new RuntimeException("employee id not found");

        return employee;
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        employeeService.save(employee);

        return employee;
    }


    @PutMapping("/employee")
    public Employee updateEmloyee(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @DeleteMapping("/employee/{empoyeeId}")
    public String deleteEmpoyee(@PathVariable int empoyeeId) {
        Employee employee = employeeService.findById(empoyeeId);

        if (employee == null)
            throw new RuntimeException("Employee id not found");

        employeeService.delete(empoyeeId);

        return "Delete this employee id:" + empoyeeId;
    }
}


