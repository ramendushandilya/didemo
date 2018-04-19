package com.shandilya.services;

import org.springframework.stereotype.Service;

/**
 * @author rams0516
 *         Date: 4/19/2018
 *         Time: 12:32 PM
 */
@Service
public class GreetingServiceImpl implements GreetingService{

    @Override
    public String sayHi() {
        return "Hello";
    }
}