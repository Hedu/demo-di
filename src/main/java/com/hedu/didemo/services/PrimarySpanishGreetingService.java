package com.hedu.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    public static final String HELLO = "Saludos desde el servicio primario!";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
