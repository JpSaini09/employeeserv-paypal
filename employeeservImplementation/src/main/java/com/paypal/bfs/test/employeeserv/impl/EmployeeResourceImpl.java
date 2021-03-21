package com.paypal.bfs.test.employeeserv.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paypal.bfs.test.employeeserv.api.APIResponse;
import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * Implementation class for employee resource.
 */
@Slf4j
@RestController
public class EmployeeResourceImpl implements EmployeeResource {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public APIResponse employeeGetById(Integer id) {
        if(Objects.isNull(id) || id <= 0) {
            log.info(String.format("No employee found with id %s", id));
            return new APIResponse("No employee found", APIResponse.STATUS.SUCCESS,  null);
        }

        Optional<Employee> employeeOptional = employeeService.findById(id);
        if(!employeeOptional.isPresent()) {
            log.info(String.format("No employee found with id %s", id));
            return new APIResponse("No employee found", APIResponse.STATUS.SUCCESS,  null);
        }
        log.info(String.format("Employee data found with id %s", id));
        return new APIResponse("Employee data found", APIResponse.STATUS.SUCCESS, employeeOptional.get());
    }

    @Override
    public APIResponse createEmployee(@Valid Employee employee) {
        return employeeService.insertEmployee(employee);
    }

}
