package com.shandilya.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author rams0516
 *         Date: 4/19/2018
 *         Time: 2:27 PM
 */
@Service
@Primary
public class DefaultGreetAnima implements GreetAnimalService{

    @Override
    public String introduceYourself() {
        return "Hi, I greet the default way...";
    }
}