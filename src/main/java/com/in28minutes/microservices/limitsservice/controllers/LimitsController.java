package com.in28minutes.microservices.limitsservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.beans.Limits;
import com.in28minutes.microservices.limitsservice.configuration.Configuration;

@RestController
@RequestMapping("/")
public class LimitsController {
    @Autowired
    private Configuration configuration;

    @RequestMapping(value = "/limits", method = RequestMethod.GET)
    public Limits limits(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());

    }




}
