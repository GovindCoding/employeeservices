package com.microservices.employeeservices.service;

import com.microservices.employeeservices.entity.Employee;
import com.microservices.employeeservices.repository.EmployeeRepo;
import com.microservices.employeeservices.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper mapper;

    public EmployeeResponse getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        return mapper.map(employee, EmployeeResponse.class);
    }

    public EmployeeResponse saveEmployee(Employee employee) {
        Employee employee1 = employeeRepo.save(employee);
        return mapper.map(employee1, EmployeeResponse.class);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }



}
