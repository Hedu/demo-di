package com.hedu.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    public static final String HELLO = "Hello from setter!";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
