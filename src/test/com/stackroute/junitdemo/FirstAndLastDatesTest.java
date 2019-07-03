package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class FirstAndLastDatesTest {
    FirstAndLastDates firstAndLastDates;
    @Before
    public void setUp() {
        System.out.println("Inside before");
        firstAndLastDates = new FirstAndLastDates();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        firstAndLastDates = null;

    }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Before class");

    }

    @AfterClass
    public static void tearDownBeforeClass() {
        System.out.println("After class");


    }

    @Test
    public void givenDateReturnAddedDate() {
        //arange

        String result = firstAndLastDates.getdate();

        //Assert
        assertEquals("Mon 01/07/2019\n" +
                "Sun 07/07/2019", result);

    }

}