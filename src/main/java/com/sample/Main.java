package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public Main(String[] args)
    {

    }

    int ReturnNumber(){
        return new Random().nextInt(10);
    }

    static void Calculate(String numbers) //throws RuntimeException
    {
        String[] nums = numbers.split(",");
        if(nums.length>2)
        {
            throw new RuntimeException("Not Allowed");
        }
    }

    static List<String> ToList(String[] strings)
    {
        return Arrays.asList(strings);
    }
}
