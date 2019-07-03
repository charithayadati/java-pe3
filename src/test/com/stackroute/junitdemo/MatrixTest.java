package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class MatrixTest {
        Matrix add;
        @Before
        public void setUp(){
            System.out.println("Inside before");
            add= new Matrix();
        }
        @After
        public void tearDown(){
            System.out.println("After");
            add=null;

        }

        @Test
        public void givenMatricesShouldReturnSumOfMatrices(){
            //arange
            int[][] a= {{1,2,3},{4,5,6}};
            int[][] b={{9,8,7},{6,5,4}};
            //Act
            String result =  add.sum(2,3,a,b);

            //Assert
            assertEquals("10 10 10 \n10 10 10",result);
        }
        @Test
        public void givenMatricesShouldReturnSumofTheTwo(){
            //arange
            int[][] a= {{1,2},{3,4},{5,6}};
            int[][] b={{9,6},{4,7},{5,4}};
            //Act
            String result =  add.sum(3,2,a,b);

            //Assert
            assertEquals("10 8 \n" + "7 11 \n" + "10 10",result);
        }

}