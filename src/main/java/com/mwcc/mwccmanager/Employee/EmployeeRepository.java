package com.mwcc.mwccmanager.Employee;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Iterable<Employee> findAll();
    Iterable<Employee> findByRole(String role);


    Iterable<Employee> findByAccessLevel(String accessLevel);

    Iterable<Employee> findByStoreId(Long storeId);

    Employee findByEmail(String email);

    Employee findById(long id);

}
