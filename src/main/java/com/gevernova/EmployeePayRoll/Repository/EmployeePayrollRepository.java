package com.gevernova.EmployeePayRoll.Repository;

import com.gevernova.EmployeePayRoll.Entity.EmployeePayroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository layer for database operations
 */
@Repository
public interface EmployeePayrollRepository extends JpaRepository<EmployeePayroll, Long> {
    // CRUD operations provided by JpaRepository
}

