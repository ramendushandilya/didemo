package com.shandilya.controllers;

import com.shandilya.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author rams0516
 *         Date: 4/19/2018
 *         Time: 12:36 PM
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    @Autowired
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHi() {
        return greetingService.sayHi();
    }
}