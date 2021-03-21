package com.paypal.bfs.test.employeeserv.service;

import com.paypal.bfs.test.employeeserv.api.APIResponse;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import java.util.Optional;

public interface EmployeeService {
    APIResponse insertEmployee(Employee employee);
    Optional<Employee> findById(Integer id);
}
