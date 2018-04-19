package com.shandilya.controllers;

import com.shandilya.services.GreetAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author rams0516
 *         Date: 4/19/2018
 *         Time: 12:47 PM
 */
@Controller
public class QualifierDemoController {

    /*@Autowired
    @Qualifier("greetFish")
    private GreetAnimalService greetAnimalService;*/

    private GreetAnimalService greetAnimalService;

    /*@Autowired
    @Qualifier("greetCat")
    public void setGreetAnimalService(GreetAnimalService greetAnimalService) {
        this.greetAnimalService = greetAnimalService;
    }*/

    @Autowired
    public QualifierDemoController(@Qualifier("greetDog") GreetAnimalService greetAnimalService) {
        this.greetAnimalService = greetAnimalService;
    }

    public String greet() {
        return greetAnimalService.introduceYourself();
    }
}