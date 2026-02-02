package com.gevernova.EmployeePayRoll.Entity;


import jakarta.persistence.*;

/**
 * Entity class representing Employee Payroll table
 */
@Entity
@Table(name = "employee_payroll")
public class EmployeePayroll {

    /**
     * Primary Key
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Employee Name
     */
    private String name;

    /**
     * Employee Salary
     */
    private double salary;

    /**
     * Department Name
     */
    private String department;

    // Default constructor (required by JPA)
    public EmployeePayroll() {}

    // Parameterized constructor
    public EmployeePayroll(Long id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // ---------- Getters & Setters ----------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

