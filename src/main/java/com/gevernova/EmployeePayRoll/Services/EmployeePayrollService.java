package com.gevernova.EmployeePayRoll.Services;


import com.gevernova.EmployeePayRoll.DTO.EmployeePayrollDTO;
import com.gevernova.EmployeePayRoll.Entity.EmployeePayroll;

import java.util.List;

/**
 * Service interface containing business logic declarations
 */
public interface EmployeePayrollService {

    EmployeePayroll addEmployee(EmployeePayrollDTO dto);

    List<EmployeePayroll> getAllEmployees();

    EmployeePayroll getEmployeeById(Long id);

    EmployeePayroll updateEmployee(Long id, EmployeePayrollDTO dto);

    void deleteEmployee(Long id);
}

