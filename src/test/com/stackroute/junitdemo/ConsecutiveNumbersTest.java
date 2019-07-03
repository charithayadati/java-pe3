package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    int[] array;
    ConsecutiveNumbers consecutiveNumbers;
    @Before
    public void setUp(){
        consecutiveNumbers=new ConsecutiveNumbers();

    }
    @After
    public void tearDown(){
        array = new int[]{0};
    }

    @Test
    public void givenNumberShouldReturnConsecutiveNumbers(){
        array = new int[]{15, 14, 13, 12, 11};
        assertEquals("consecutive numbers", consecutiveNumbers.checker(array));
    }
    @Test
    public void givenNumShouldReturnTrue(){
        array = new int[]{33,34,35,36,37};
        assertEquals("consecutive numbers", consecutiveNumbers.checker(array));
    }


}