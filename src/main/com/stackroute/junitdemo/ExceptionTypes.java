package com.stackroute.junitdemo;

public class ExceptionTypes {
    public String types(Integer input){

        try
        {
            int[] Array = new int[input];
            System.out.println(Array[input+1]);
            return "the array is" +Array;

        }
        catch (NullPointerException e)
        {
            return("NullPointerException Caught");
        }
        catch (IndexOutOfBoundsException e)
        {
            return("IndexOutOfBoundException caught");
        }
        catch (NegativeArraySizeException e)
        {
            return("NegativeArraySizeException caught");
        }

    }
}
