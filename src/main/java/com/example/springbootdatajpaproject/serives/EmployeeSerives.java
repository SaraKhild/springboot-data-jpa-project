package com.example.springbootdatajpaproject.serives;

import com.example.springbootdatajpaproject.enitity.Employee;

import java.util.List;

public interface EmployeeSerives {

    public List<Employee> findAll();
    public Employee findById(int id);
    public void save (Employee employee);
    public void delete (int id);
}


