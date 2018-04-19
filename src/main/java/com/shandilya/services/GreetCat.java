package com.shandilya.services;

import org.springframework.stereotype.Service;

/**
 * @author rams0516
 *         Date: 4/19/2018
 *         Time: 12:49 PM
 */
@Service
public class GreetCat implements GreetAnimalService{

    @Override
    public String introduceYourself() {
        return "Cat says Hi!";
    }
}