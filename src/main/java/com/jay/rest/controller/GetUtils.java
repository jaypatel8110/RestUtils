package com.jay.rest.controller;

import com.jay.rest.models.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class GetUtils {

    @PostMapping("/putgreet")
    @ResponseBody
    public String getPutGreetings(@RequestBody String msg){
        return msg+" Put is called";
    }

    @PostMapping("/student")
    @ResponseBody
    public String getPutGreetings(@RequestBody Student msg){
        return msg + " Student is called ";
    }
}
