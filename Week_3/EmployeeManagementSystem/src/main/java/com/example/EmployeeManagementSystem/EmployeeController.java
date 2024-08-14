package com.example.EmployeeManagementSystem.controllers;

import com.example.EmployeeManagementSystem.entities.Employee;
import com.example.EmployeeManagementSystem.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/paged-and-sorted")
    public Page<Employee> getEmployeesPagedAndSorted(@RequestParam int page, @RequestParam int size, @RequestParam String sortBy) {
        return employeeRepository.findAll(PageRequest.of(page, size, Sort.by(sortBy)));
    }
}
