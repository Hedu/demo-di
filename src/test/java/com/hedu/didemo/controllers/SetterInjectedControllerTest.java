package com.hedu.didemo.controllers;

import com.hedu.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void  testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO, setterInjectedController.sayHello());
    }
}
