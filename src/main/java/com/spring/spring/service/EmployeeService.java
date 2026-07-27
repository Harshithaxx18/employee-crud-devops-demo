package com.spring.spring.service;

import com.spring.spring.entity.Employee;
import com.spring.spring.repository.EmployeeRepository;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository)
    {
        this.repository = repository;
    }

    public List<Employee> getAllEmployees()
    {
        return repository.findAll();
    }
    public Employee createEmployee(Employee employee)
    {
        return repository.save(employee);
    }

    public Optional<Employee>  getEmployeeById(Long id)
    {
        return repository.findById(id);
    }
    public void deleteEmployee(Long id){
         repository.deleteById(id);
    }
    public Employee updateEmployee(Long id, Employee employee)
    {
        Employee employee1 = repository.findById(id).get();
        employee1.setDepartment(employee.getDepartment());
        employee1.setName(employee.getName());
        return repository.save(employee1);
    }
    public List<Employee> getEmployeesByDepartment(String department)
    {
        return repository.findByDepartment(department);
    }



}
