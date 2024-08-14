package com.example.EmployeeManagementSystem.repositories;

import com.example.EmployeeManagementSystem.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
