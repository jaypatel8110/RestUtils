package com.jay.rest.controller;

import com.jay.rest.StaticObjects;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SplunkLogGenerator implements StaticObjects {

    @GetMapping("/log")
    public String getPutGreetings(){

        getLogger().info(" log end point called");
        return "Good call "+ HttpStatus.OK;
    }

}
