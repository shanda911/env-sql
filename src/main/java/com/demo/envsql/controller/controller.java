package com.demo.envsql.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Value("${TEST_ENV0:defaultText}") // value after ':' is the default
    String TEST_ENV0;
    @Value("${TEST_ENV1:defaultText}") // value after ':' is the default
    String TEST_ENV1;

    @GetMapping("/")
    public String  isAvailable(){
        return "Service is up!";
    }
    @GetMapping("/test-env-0")
    public String  testEnvironment0(){
        return "Env is:"+TEST_ENV0;
    }
    @GetMapping("/test-env-1")
    public String  testEnvironment1(){
        return "Env is:"+TEST_ENV1;
    }
}
