package com.gevernova.EmployeePayRoll.Controllers;

import com.gevernova.EmployeePayRoll.DTO.EmployeePayrollDTO;
import com.gevernova.EmployeePayRoll.Entity.EmployeePayroll;
import com.gevernova.EmployeePayRoll.Services.EmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller to handle HTTP requests
 */
@RestController
@RequestMapping("/api/employees")
public class EmployeePayrollController {

    /**
     * Injecting service dependency
     */
    @Autowired
    private EmployeePayrollService service;

    /**
     * Create employee
     */
    @PostMapping
    public ResponseEntity<EmployeePayroll> addEmployee(@RequestBody EmployeePayrollDTO dto) {
        return ResponseEntity.ok(service.addEmployee(dto));
    }

    /**
     * Get all employees
     */
    @GetMapping
    public ResponseEntity<List<EmployeePayroll>> getAllEmployees() {
        return ResponseEntity.ok(service.getAllEmployees());
    }

    /**
     * Get employee by ID
     */
    @GetMapping("/{id}")
    public ResponseEntity<EmployeePayroll> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getEmployeeById(id));
    }

    /**
     * Update employee by ID
     */
    @PutMapping("/{id}")
    public ResponseEntity<EmployeePayroll> updateEmployee(
            @PathVariable Long id,
            @RequestBody EmployeePayrollDTO dto) {
        return ResponseEntity.ok(service.updateEmployee(id, dto));
    }

    /**
     * Delete employee by ID
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
        return ResponseEntity.ok("Employee deleted successfully");
    }
}

