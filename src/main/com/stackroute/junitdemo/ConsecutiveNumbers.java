package com.stackroute.junitdemo;

import java.util.Arrays;

public class ConsecutiveNumbers {
    public  String checker(int[] input)
    {
        int i=0;
        Arrays.sort(input);
        for (i=0;i<input.length-1;i++)
        {
            if (input[i]==input[i+1]-1)
                continue;

            else
                return "non consecutive numbers";
        }
        return "consecutive numbers";

    }
}
