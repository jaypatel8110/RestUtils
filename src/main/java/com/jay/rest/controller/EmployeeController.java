package com.jay.rest.controller;

import java.net.URI;

import com.jay.rest.dao.EmployeeDAO;
import com.jay.rest.models.Employee;
import com.jay.rest.models.Employees;
import com.jay.rest.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
    @Autowired
    private EmployeeDAO employeeDao;

    @GetMapping(path = "/", produces = "application/json")
    public Employees getEmployees() {
        return employeeDao.getAllEmployees();
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(
            @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
            @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
            @RequestBody Employee employee)
            throws Exception {
        //Generate resource id
        Integer id = employeeDao.getAllEmployees().getEmployeeList().size() + 1;
        employee.setId(id);

        //add resource
        employeeDao.addEmployee(employee);

        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employee.getId())
                .toUri();

        //Send location in response
        return ResponseEntity.created(location).build();
    }


  /*  ResponseEntity represents an HTTP response, including headers, body, and status. While @ResponseBody puts
        the return value into the body of the response,
    ResponseEntity also allows us to add headers and status code.*/

    @RequestMapping(value = "/getCountry")
    public ResponseEntity<Student> getStudentWithResponseEntity() {

        var c = new Student();
        c.setName("France");

        var headers = new HttpHeaders();
        headers.add("Responded", "MyController");
        return ResponseEntity.accepted().headers(headers).body(c);
    }

    @RequestMapping(value = "/getCountry2")
    @ResponseBody
    public Student getStudentWithResponseEntity2() {

        var c = new Student();
        c.setName("France");
        return c;
    }

}