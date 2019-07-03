package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThrowingExceptionTest {
    ThrowingException throwingException;
    @Before
    public void setUp(){

        throwingException= new ThrowingException();
    }
    @After
    public void tearDown(){
        throwingException=null;
    }

    @Test
    public void givenNumberShouldReturnError(){
        // arr = new int[]{5, 4, 3, 2, 1};
        String string = throwingException.test();
        assertEquals("Exception\n" + "catch statement\n" + "finally",string);
    }

}