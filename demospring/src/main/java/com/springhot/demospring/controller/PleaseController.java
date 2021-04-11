package com.springhot.demospring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PleaseController {

    @RequestMapping("hello")
    public String getResponse(){
        return "my first response";
    }
}

