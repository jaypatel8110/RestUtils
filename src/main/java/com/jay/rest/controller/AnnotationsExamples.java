package com.jay.rest.controller;


import com.jay.rest.StaticObjects;
import com.jay.rest.models.Dbsettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AnnotationsExamples implements StaticObjects {

    @Value("${my.test:Default hello world}")
    private String getHelloWorld;

    @Autowired
    private Dbsettings dbsettings;

    @RequestMapping("/hello")
    public String getGetHelloWorld(){
        getLogger().trace("Hello called");
        return  getHelloWorld;
    }

    @RequestMapping("/greet")
    public String getGreetings(){
        return  dbsettings.getConnection();
    }



}
