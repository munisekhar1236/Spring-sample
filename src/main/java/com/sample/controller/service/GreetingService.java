package com.sample.controller.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class GreetingService {
	 private Logger logger = Logger.getLogger(GreetingService.class);
	 public String greet(@PathVariable String name, ModelMap model) {
	        String greet = "Hello!!! " + name + " How are You?";
	        logger.info(greet);
	        return greet;
	 }
}
