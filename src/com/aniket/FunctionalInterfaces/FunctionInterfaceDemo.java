package com.aniket.FunctionalInterfaces;

import java.util.function.Function;

class FunctionDemo implements Function<String,Integer>
{
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionInterfaceDemo
{
    public static void main(String[] args)
    {
        //Traditional way
        FunctionDemo fn = new FunctionDemo();
        System.out.println("Aniket Charaters : " + fn.apply("Aniket"));

        //Using Lambda Expression
        Function<String,Integer> function = (input) -> input.length();
        System.out.println("Vaishnavi Characters : " + function.apply("Vaishnavi"));
    }
}
