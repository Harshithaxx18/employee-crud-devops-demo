package com.spring.spring.entity;
import jakarta.persistence.*;
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private  Long id;
    private String name;
    private  String department;

    public Employee()
    {

    }
    public Employee( String name, String department)
    {
        this.name = name;
        this.department = department;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public long getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getDepartment()
    {
        return this.department;
    }


}
