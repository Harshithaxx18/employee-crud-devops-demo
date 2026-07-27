package com.spring.spring.controller;

import com.spring.spring.entity.Employee;
import com.spring.spring.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//Employee CRUD API
@RestController
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service)
    {
        this.service = service;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees()
    {
        return service.getAllEmployees();
    }
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee)
    {
        return service.createEmployee(employee);
    }
    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id)
    {
        return service.getEmployeeById(id);
    }
    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Long id)
    {
        service.deleteEmployee(id);
    }
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee employee)
    {
        return service.updateEmployee(id,employee);
    }
    @GetMapping("/employees/department/{department}")
    public List<Employee> getEmployeeByDepartment(@PathVariable String department)
    {
        return service.getEmployeesByDepartment(department);
    }

}
