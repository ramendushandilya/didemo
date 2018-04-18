package com.shandilya.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author rams0516
 *         Date: 4/18/2018
 *         Time: 5:19 PM
 */
@Controller
public class MyController {

    public String sayHi() {
        System.out.println("Hello from Controller");
        return "foo";
    }
}