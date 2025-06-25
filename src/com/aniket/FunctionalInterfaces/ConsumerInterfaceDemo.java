package com.aniket.FunctionalInterfaces;


import java.util.function.Consumer;

class ConsumerDemo implements Consumer<String>
{
    @Override
    public void accept(String s)
    {
        System.out.println(s);
    }
}

public class ConsumerInterfaceDemo
{
    public static void main(String[] args)
    {
        //Traditional Way
        Consumer<String> con = new ConsumerDemo();
        con.accept("Hello this is Aniket !!");

        //Using Lambda Expression
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Hello this is using Lambda Expression !!");
    }
}
