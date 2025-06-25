package com.aniket.LambdaExpressions;

//Functional Interface (Only one Abstract Method)
interface Shape
{
    void draw();
}


//Traditional method by creating classes to provide implementation to implemented interface
class Rectangle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Rectangle : draw() method");
    }
}

//Traditional method by creating classes to provide implementation to implemented interface
class Circle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Circle : draw() method");
    }
}

public class LambdaExample
{
    public static void main(String[] args)
    {
        //Traditionally creating objects and calling methods
        Circle c = new Circle();
        c.draw();

        Rectangle r = new Rectangle();
        r.draw();
    }
}