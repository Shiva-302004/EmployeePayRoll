package com.gevernova.EmployeePayRoll.DTO;


/**
 * DTO used to accept request data from client
 */
public class EmployeePayrollDTO {

    private String name;
    private double salary;
    private String department;

    // Default constructor
    public EmployeePayrollDTO() {}

    // Parameterized constructor
    public EmployeePayrollDTO(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // ---------- Getters & Setters ----------

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

