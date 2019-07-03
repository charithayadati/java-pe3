package com.stackroute.junitdemo;

public class ThrowingException {
    public String test(){
        String result="";
        try
        {
            throw new Exception("Exception");
        }
        catch (Exception e)
        {
            result = e.getMessage();
            result=result + "\ncatch statement\n";
        }
        finally {
            result = result + "finally";
        }
        return result;
    }
}
