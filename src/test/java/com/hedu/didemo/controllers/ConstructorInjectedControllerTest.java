package com.hedu.didemo.controllers;

import com.hedu.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void  testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO, constructorInjectedController.sayHello());
    }
}
