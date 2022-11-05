package com.startup.realtor.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RealtorController {

    @GetMapping("/test/{text}")
    public String get(@PathVariable String test){
        return test;
    }
}
