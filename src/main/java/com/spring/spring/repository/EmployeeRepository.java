package com.spring.spring.repository;

import com.spring.spring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByDepartment(String Department);

}
