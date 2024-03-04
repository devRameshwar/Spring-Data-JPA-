package com.service;

import com.entity.Employee;
import com.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeServise {

    @Autowired
    private EmployeeRepository repository;

    public void saveEmployee(Employee employee){
        repository.save(employee);
        System.out.println("Employee Data Save... ");
    }
    public void getAllEmployee(){
        //getting All data to findAll method
        List<Employee> employees = repository.findAll();

        employees.forEach(System.out::println);
    }
}
