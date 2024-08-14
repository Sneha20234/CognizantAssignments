package com.example.EmployeeManagementSystem.repositories;

import com.example.EmployeeManagementSystem.entities.Employee;
import com.example.EmployeeManagementSystem.projections.EmployeeProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<EmployeeProjection> findAllProjectedBy();
}
