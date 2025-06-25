package com.aniket.LambdaExpressions;

interface Addable
{
    int addition(int a, int b);
}

public class LambdaParameters
{
    public static void main(String[] args)
    {
        //Lambda Expression with Parameter list with Multiple lines in body
        Addable add1 = (a,b) -> {
            return (a+b);
        };

        //Lambda Expression with Parameter with single line body
        Addable add2 = (int a, int b) -> (a+b);

        int sum1 = add1.addition(5,7);
        System.out.println("Addition : " + sum1);

        int sum2 = add2.addition(5,8);
        System.out.println("Addition : " + sum2);
    }
}