package com.gevernova.EmployeePayRoll.Services;


import com.gevernova.EmployeePayRoll.DTO.EmployeePayrollDTO;
import com.gevernova.EmployeePayRoll.Entity.EmployeePayroll;

import java.util.List;

/**
 * Service interface containing business logic declarations
 */
public interface EmployeePayrollService {

    String addEmployee(EmployeePayrollDTO dto);

    List<EmployeePayrollDTO> getAllEmployees();

    EmployeePayrollDTO getEmployeeById(Long id);

    String updateEmployee(Long id, EmployeePayrollDTO dto);

    void deleteEmployee(Long id);
}

