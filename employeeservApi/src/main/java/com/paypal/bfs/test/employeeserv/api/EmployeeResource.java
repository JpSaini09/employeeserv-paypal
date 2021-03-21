package com.paypal.bfs.test.employeeserv.api;

import com.paypal.bfs.test.employeeserv.api.model.Employee;
import org.springframework.web.bind.annotation.*;

/**
 * Interface for employee resource operations.
 */
public interface EmployeeResource {

    /**
     * Retrieves the {@link Employee} resource by id.
     *
     * @param id employee id.
     * @return {@link Employee} resource.
     */
    @GetMapping("/v1/bfs/employees/{id}")
    APIResponse employeeGetById(@PathVariable("id") Integer id);

    /**
     * create the {@link Employee} resource.
     *
     * @param employee {@link Employee} resource
     * @return
     */
    @PostMapping("/v1/employee/create")
    APIResponse createEmployee(@RequestBody Employee employee);
}
