package com.demo.envsql.controller;

import com.demo.envsql.model.Locker;
import com.demo.envsql.repo.LockerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private LockerRepository lockerRepository;

    @Value("${TEST_ENV0:defaultText}")
    String TEST_ENV0;
    @Value("${TEST_ENV1:defaultText}")
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

    @PostMapping("/issue")
    public Locker issueLocker(@RequestBody Locker locker) {
        return lockerRepository.save(locker);
    }

    @GetMapping("/lockers")
    public List<Locker> getLockers(){
        return lockerRepository.findAll();
    }

    }
