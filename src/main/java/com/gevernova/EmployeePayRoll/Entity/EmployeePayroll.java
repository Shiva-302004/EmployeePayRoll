package com.gevernova.EmployeePayRoll.Entity;


import jakarta.persistence.*;
import lombok.*;

/**
 * Entity class representing Employee Payroll table
 */
@Entity
@Table(name = "employee_payroll")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
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


}

