package com.example.springbootdatajpaproject.serives;

import com.example.springbootdatajpaproject.dao.EmpoyeeRepository;
import com.example.springbootdatajpaproject.enitity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeSerivesImpl implements EmployeeSerives {

    @Autowired
    private EmpoyeeRepository empoyeeRepository;


    @Override
    public List<Employee> findAll() {
        return empoyeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {

        Optional<Employee> result = empoyeeRepository.findById(id);

        Employee employee = null;

        if( result.isPresent())
            employee=result.get();
        else
            throw new RuntimeException("did not find id");

        return employee;
    }

    @Override
    public void save(Employee employee) {
         empoyeeRepository.save(employee);
    }

    @Override
    public void delete(int id) {
     empoyeeRepository.deleteById(id);
    }
}
