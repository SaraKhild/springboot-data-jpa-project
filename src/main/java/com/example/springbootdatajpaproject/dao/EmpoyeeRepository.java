package com.example.springbootdatajpaproject.dao;

import com.example.springbootdatajpaproject.enitity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpoyeeRepository  extends JpaRepository<Employee,Integer> {

    //no need to wirte any code
}
