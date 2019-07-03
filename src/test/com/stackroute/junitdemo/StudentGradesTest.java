package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {
    StudentGrades studentGrades;
    @Before
    public void setUp()throws Exception {
        studentGrades = new StudentGrades();
    }

    @Test
    public void givenMarksvalidateStudentMarks()
    {
        int students=10;
        int[] marks = {76,90,52,12,76,34,72,20,80,40};
        String result = studentGrades.checkTheRange(students,marks);

        assertEquals("Grades are correct",result);
    }
    @Test
    public void givenMarksvalidateMarks()
    {
        int students=10;
        int[] marks = {76,909,52,12,76,34,72,20,803,40};
        String result = studentGrades.checkTheRange(students,marks);

        assertEquals("Exception",result);
    }
    @After
    public void tearDown(){
        studentGrades = null;
    }

}