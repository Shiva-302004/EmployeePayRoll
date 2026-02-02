package com.gevernova.EmployeePayRoll.Services;


import com.gevernova.EmployeePayRoll.DTO.EmployeePayrollDTO;
import com.gevernova.EmployeePayRoll.Entity.EmployeePayroll;
import com.gevernova.EmployeePayRoll.Repository.EmployeePayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service implementation class
 */
@Service
public class EmployeePayrollServiceImpl implements EmployeePayrollService {

    /**
     * Injecting repository dependency
     */
    @Autowired
    private EmployeePayrollRepository repository;

    /**
     * Add new employee
     */
    @Override
    public EmployeePayroll addEmployee(EmployeePayrollDTO dto) {
        EmployeePayroll employee = new EmployeePayroll();

        // Mapping DTO to Entity
        employee.setName(dto.getName());
        employee.setSalary(dto.getSalary());
        employee.setDepartment(dto.getDepartment());

        return repository.save(employee);
    }

    /**
     * Get all employees
     */
    @Override
    public List<EmployeePayroll> getAllEmployees() {
        return repository.findAll();
    }

    /**
     * Get employee by ID
     */
    @Override
    public EmployeePayroll getEmployeeById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }

    /**
     * Update employee by ID
     */
    @Override
    public EmployeePayroll updateEmployee(Long id, EmployeePayrollDTO dto) {
        EmployeePayroll employee = getEmployeeById(id);

        employee.setName(dto.getName());
        employee.setSalary(dto.getSalary());
        employee.setDepartment(dto.getDepartment());

        return repository.save(employee);
    }

    /**
     * Delete employee by ID
     */
    @Override
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}

