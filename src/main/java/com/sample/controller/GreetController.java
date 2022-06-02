package com.sample.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sample.controller.service.GreetingService;

@RestController
public class GreetController {
 
    private Logger logger = Logger.getLogger(GreetController.class);
    @Autowired private GreetingService greetingService;
    
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name, ModelMap model) {
       return greetingService.greet(name, model);
    }
}
