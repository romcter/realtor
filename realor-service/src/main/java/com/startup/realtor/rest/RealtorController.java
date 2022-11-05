package com.startup.realtor.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RealtorController {

    @GetMapping("/test")
    public boolean get(){
        return true;
    }
}
