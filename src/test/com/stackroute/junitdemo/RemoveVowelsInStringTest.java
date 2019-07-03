package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsInStringTest {
    RemoveVowelsInString removeVowelsInString;

    @Before
    public void setUp()throws Exception {
        removeVowelsInString = new RemoveVowelsInString();
    }

    @Test
    public void givenStringsShouldReturnRemovingTheVowels()
    {
        String input[] = {"India","United States","Germany","Egypt","czechoslovakia"};
        String output[] = {"Ind","Untd Stts", "Grmny","Egypt", "czchslvk"};
        String[] result = removeVowelsInString.remove(input);

        assertArrayEquals(output,result);
    }
    @Test
    public void givenStringsShouldReturnRemovingVowels()
    {
        String input[] = {"India","United States","Germany","Egypt","czechoslovakia"};
        String output[] = {"Ind","Untd ", "Grmny","Eg", "czcvk"};
        String[] result = removeVowelsInString.remove(input);
        assertNotEquals(output,result);
    }

    @After
    public void tearDown(){
        removeVowelsInString = null;
    }


}