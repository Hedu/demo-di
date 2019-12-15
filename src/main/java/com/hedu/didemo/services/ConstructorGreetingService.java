package com.hedu.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    public static final String HELLO = "Hello from constructor!";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
