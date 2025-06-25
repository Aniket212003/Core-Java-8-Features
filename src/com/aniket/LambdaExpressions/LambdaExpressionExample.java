package com.aniket.LambdaExpressions;

interface ShapeEx
{
    void draw();
}

public class LambdaExpressionExample
{
    public static void main(String[] args)
    {
        //Lambda Expression with no parameter list (Moto to reduce Code)
        ShapeEx rectangle = () -> System.out.println("Rectangle : draw() method !!");
        //Lambda Expression with no parameter list (Moto to reduce Code)
        ShapeEx circle = () -> System.out.println("Circle : draw() method !!");

        rectangle.draw();
        circle.draw();
    }
}