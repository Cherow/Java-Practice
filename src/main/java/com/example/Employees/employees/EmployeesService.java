package com.example.Employees.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {

 private final EmployeesRepository employeesRepository;
 @Autowired
    public EmployeesService(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    public List<Employees> getEmployees(){
     return employeesRepository.findAll();
    }


}
