package com.hedu.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingService implements GreetingService {

    public static final String HELLO = "Primarer ... de!";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
