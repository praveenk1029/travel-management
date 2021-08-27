package com.gpk.travelmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rental")
public class RentalController {

    @GetMapping(value = "/getAvailableCars")
    public List<String> getAvailableCars(){
        return Arrays.asList("Compact", "Economy", "Full Size", "Mini Van");
    }
}
