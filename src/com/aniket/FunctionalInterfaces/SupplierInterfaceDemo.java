package com.aniket.FunctionalInterfaces;


import jdk.jshell.execution.LoaderDelegate;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierDemo implements Supplier<LocalDateTime>
{

    @Override
    public LocalDateTime get()
    {
        return LocalDateTime.now();
    }
}

public class SupplierInterfaceDemo
{
    public static void main(String[] args)
    {
        //Traditional way
        Supplier<LocalDateTime> ob = new SupplierDemo();
        System.out.println("Today's TimeStamp :" + ob.get());

        //Using Lambda Expression
        Supplier<LocalDateTime> time = () -> LocalDateTime.now();
        System.out.println("TimeStamp Using Lambda Expression : " + time.get());
    }


}
