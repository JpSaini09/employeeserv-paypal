package com.paypal.bfs.test.employeeserv.impl;

import com.paypal.bfs.test.employeeserv.api.APIResponse;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.repo.EmployeeRepo;
import com.paypal.bfs.test.employeeserv.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;


    @Override
    public APIResponse insertEmployee(Employee employee) {
        Employee emp = null;
        try {
            emp = employeeRepo.save(employee);
        } catch (Exception e) {
            log.error(String.format("Error creating object with name %s", employee.getFirstName()));
            return new APIResponse("Error creating employee", APIResponse.STATUS.FAILURE, null);
        }

        if(emp.getId() == null) {
            log.error(String.format("Error creating object with name %s", employee.getFirstName()));
            return new APIResponse("Error creating employee", APIResponse.STATUS.FAILURE, null);
        }

        log.info(String.format("Employee created with id: %s", emp.getId()));
        return new APIResponse("Successfully Inserted Employee Record", APIResponse.STATUS.SUCCESS, "Employee created with Id:"+ emp.getId());
    }

    @Override
    public Optional<Employee> findById(Integer id) {
        return employeeRepo.findById(id);
    }
}
