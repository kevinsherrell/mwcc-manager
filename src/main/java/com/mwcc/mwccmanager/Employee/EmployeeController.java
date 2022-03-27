package com.mwcc.mwccmanager.Employee;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<?> addNewEmployee(@RequestBody Employee employee) throws Exception {
        employee.setId(0L);
        System.out.println(employee.getId());
        employeeService.saveOrUpdateEmployee(employee);
        System.out.println(employee.getHomeStore().toString());
        return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) throws Exception {
        employee.setId(id);
        employeeService.saveOrUpdateEmployee(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @GetMapping("all")
    public ResponseEntity<?> getAllEmployees() throws Exception {
        System.out.println("Find All Is Firing");
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.ACCEPTED);
    }

    @GetMapping("id/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Long id) {

        return new ResponseEntity<>(employeeService.getById(id), HttpStatus.ACCEPTED);
    }

    @GetMapping("role/{role}")
    public ResponseEntity<?> getAllByRole(@PathVariable String role) {
        return new ResponseEntity<>(employeeService.getByRole(role), HttpStatus.ACCEPTED);
    }

    @GetMapping("/store/{storeId}")
    public ResponseEntity<?> getAllByStoreId(@PathVariable Long storeId) {
        return new ResponseEntity<>(employeeService.getAllByStoreId(storeId), HttpStatus.ACCEPTED);
    }

    @GetMapping("access/{accessLevel}")
    public ResponseEntity<?> getAllByAccessLevel(@PathVariable String accessLevel) {
        return new ResponseEntity<>(employeeService.getByAccessLevel(accessLevel), HttpStatus.ACCEPTED);
    }
}
