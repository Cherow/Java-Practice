package com.example.Employees.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/employees")
public class EmployeesController {
    private  final EmployeesService employeesService;
    @Autowired

    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }





}
