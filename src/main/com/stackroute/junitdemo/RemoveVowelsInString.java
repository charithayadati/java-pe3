package com.stackroute.junitdemo;

public class RemoveVowelsInString {
    public static String[] remove(String[] input) {
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            input[i] = input[i].replaceAll("[aeiou]", "");

        }
        return input;
    }
}
