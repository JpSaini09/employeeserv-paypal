# employeeserv

## Application Overview
employeeserv is a spring boot rest application which would provide the CRUD operations for `Employee` resource.

There are three modules in this application
- employeeservApi - This module contains the interface.
	- `v1/schema/employee.json` defines the employee resource.
	- `jsonschema2pojo-maven-plugin` is being used to create `Employee POJO` from json file.
	- `EmployeeResource.java` is the interface for CRUD operations on `Employee` resource.
		- GET `/v1/bfs/employees/{id}` endpoint is defined to fetch the resource.
		- POST `/v1/employee/create` endpoint to create employee
- employeeservImplementation - This module contains the implementation for the rest endpoints.
	- `EmployeeResourceImpl.java` implements the `EmployeeResource` interface.
	
## Assignment curl API's

##### POST CALL
`curl --location --request POST 'localhost:8080/v1/employee/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "first_name": "Test",
    "last_name": "Name",
    "date_of_birth": "2020-11-19",
    "address": {
        "line_1": "address line 1",
        "line_2": "address line 2",
        "city": "city name",
        "state": "state name",
        "country": "country name",
        "zip_code": 1234567
    }
}' `
##### GET CALL
`curl --location --request GET 'localhost:8080/v1/bfs/employees/1'`
