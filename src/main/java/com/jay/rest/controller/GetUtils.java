package com.jay.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class GetUtils {

    @GetMapping("/greeting")
    public String getPutGreetings(@RequestHeader("accept-language") String msg){
        return msg+ HttpStatus.OK;
    }

    @GetMapping("/test")
    public String getTestGreetings(){
        return "Good"+ HttpStatus.OK;
    }

}
