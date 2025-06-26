package com.aniket.MethodReferences;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

interface Printable
{
    void print(String msg);
}


public class MethodReferenceDemo
{
    public void display(String msg)
    {
        msg = msg.toUpperCase();
        System.out.println(msg);
    }

    public static void main(String[] args)
    {
        /* 1. Method Reference to a Static Method  */

        //Using Lambda Expression
        Function<Integer, Double> function = (sqr) -> Math.sqrt(sqr);
        System.out.println("Square Root of 16 : " + function.apply(16));

        //Using Method Reference
        Function<Integer,Double> fun = Math::sqrt;
        System.out.println("Square Root of 64 : " + fun.apply(64));

        /* 2. Method Reference to a Instance Method of an Object  */
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();

        //Using Lambda Expression
        Printable printable = (msg) -> methodReferenceDemo.display(msg);
        printable.print("Hello!!");

        //Using Method Reference
        Printable printable1 = methodReferenceDemo::display;
        printable1.print("Hello aniket !!");


        /* 3. Reference to the Instance Method of an arbitrary Object  */

        //Using Lambda Expression
        Function<String,String> stringStringFunction = (input) -> input.toLowerCase();
        System.out.println(stringStringFunction.apply("ANIKET BELGAONKAR"));

        //Using Method Reference
        Function<String, Integer> function3 = String::length;
        System.out.println("Length : " + function3.apply("BELGAONKAR"));

        /* 4. Reference to the constructor  */

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Orange");

        //Using Lambda Expression
        Function<List<String>, Set<String>> setFun = (furstlist) -> new HashSet<>(furstlist);
        System.out.println("Fruit List : " + setFun.apply(list));

        //Using Method Reference
        Function<List<String>,Set<String>> setFun1 = HashSet::new;
        System.out.println("Fruit List Using Method reference : " + setFun1.apply(list));



    }
}
