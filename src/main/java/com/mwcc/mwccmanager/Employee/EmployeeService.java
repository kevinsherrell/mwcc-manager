package com.mwcc.mwccmanager.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveOrUpdateEmployee(Employee employee) throws Exception {

        return employeeRepository.save(employee);
    }

    public Iterable<Employee> getAllEmployees() throws Exception {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getById(Long id) {
        return employeeRepository.findById(id);
    }

    public Iterable<Employee> getByRole(String role) {
        return employeeRepository.findByRole(role);
    }
    public Iterable<Employee> getByAccessLevel(String accessLevel){
        return employeeRepository.findByAccessLevel(accessLevel);
    }
}
