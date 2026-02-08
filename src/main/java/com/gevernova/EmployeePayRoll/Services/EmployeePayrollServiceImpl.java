package com.gevernova.EmployeePayRoll.Services;


import com.gevernova.EmployeePayRoll.DTO.EmployeePayrollDTO;
import com.gevernova.EmployeePayRoll.Entity.EmployeePayroll;
import com.gevernova.EmployeePayRoll.Repository.EmployeePayrollRepository;
import com.gevernova.EmployeePayRoll.globalexception.IdNotFound;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service implementation class
 */
@Service
@Slf4j
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
    public String addEmployee(EmployeePayrollDTO dto) {
        EmployeePayroll employee =EmployeePayroll.builder()
                .name(dto.getName())
                .department(dto.getDepartment())
                .salary(dto.getSalary())
                .build();

        repository.save(employee);
        log.info("new employee created successfully");
        return "new employee created successfully";
    }

    /**
     * Get all employees
     */
    @Override
    public List<EmployeePayrollDTO> getAllEmployees() {

        List<EmployeePayroll> employees=repository.findAll();
        log.info("all employee fetched successfully");
        return employees.stream()
                .map(this::transform).toList();
    }
    public EmployeePayrollDTO transform(EmployeePayroll employeePayroll){
        return EmployeePayrollDTO.builder()
                .name(employeePayroll.getName())
                .salary(employeePayroll.getSalary())
                .department(employeePayroll.getDepartment())
                .build();
    }

    /**
     * Get employee by ID
     */
    @Override
    public EmployeePayrollDTO getEmployeeById(Long id) {
        EmployeePayroll employee=repository.findById(id)
                .orElseThrow(() -> new IdNotFound("Employee not found with id: " + id));
        log.info("information fetched for employee with id : "+id);
        return transform(employee);
    }

    /**
     * Update employee by ID
     */
    @Override
    public String updateEmployee(Long id, EmployeePayrollDTO dto) {
        EmployeePayroll employee = repository.findById(id)
                .orElseThrow(() -> new IdNotFound("Employee not found with id: " + id));

        employee.setName(dto.getName());
        employee.setSalary(dto.getSalary());
        employee.setDepartment(dto.getDepartment());

        repository.save(employee);
        log.info("employee updated successfully");
        return "employee updated successfully";
    }

    /**
     * Delete employee by ID
     */
    @Override
    public void deleteEmployee(Long id) {
        log.info("employee deleted successfully");
        repository.deleteById(id);
    }
}

