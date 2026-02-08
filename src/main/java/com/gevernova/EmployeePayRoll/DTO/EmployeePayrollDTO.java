package com.gevernova.EmployeePayRoll.DTO;


import lombok.*;

/**
 * DTO used to accept request data from client
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class EmployeePayrollDTO {
    private String name;
    private double salary;
    private String department;
}

