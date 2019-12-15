package com.hedu.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {

    public static final String HELLO = "Hello from the primary!";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
