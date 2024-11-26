package com.microservices.employeeservices.controller;


import com.microservices.employeeservices.entity.Employee;
import com.microservices.employeeservices.response.EmployeeResponse;
import com.microservices.employeeservices.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    private ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") int id) {

        log.info("Employee get id service called....");

        EmployeeResponse employee = employeeService.getEmployeeById(id);
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }

    @PostMapping("/employees")
    private ResponseEntity<EmployeeResponse> saveEmployeeDetails(@Validated @RequestBody Employee employee) {
//        EmployeeResponse employee = employeeService.saveEmployee(employeeTemp);
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.saveEmployee(employee));

    }

    @GetMapping("/employees")
    private ResponseEntity<List<Employee>> getEmployee() {
        List<Employee> employees = employeeService.getAllEmployees();
        return ResponseEntity.status(HttpStatus.OK).body(employees);
    }


}
