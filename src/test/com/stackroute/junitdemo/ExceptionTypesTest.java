package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionTypesTest {
    ExceptionTypes exceptionTypes;
    @Before
    public void setUp(){

        exceptionTypes= new ExceptionTypes();

    }
    @After
    public void tearDown(){
        exceptionTypes= null;
        // arr = new String[][]{};
    }

    @Test
    public void givenNumberShouldReturnNull() {
        String string= exceptionTypes.types(null);
        assertEquals("NullPointerException Caught", string);
    }
    @Test
    public void givenNumberShouldReturnException() {
        String string= exceptionTypes.types(3);
        assertEquals("IndexOutOfBoundException caught", string);
    }
    @Test
    public void givenNumberShouldReturnSizeException() {
        String string= exceptionTypes.types(-20);
        assertEquals("NegativeArraySizeException caught", string);
    }


}