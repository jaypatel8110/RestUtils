package com.jay.rest.controller;

import com.jay.rest.models.Student;
import com.jay.rest.models.StudentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "/micro")
public class CallAnotherMicroService {

    @Value("${Microservicetwo.port:Default 8086}")
    private String port;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/",produces = "application/json")
    public StudentList callMicroServiceTwo() {
       StudentList studentList = restTemplate.getForObject("http://localhost:"+port+"/studentinfo/", StudentList.class);
        return studentList;
    }
}
