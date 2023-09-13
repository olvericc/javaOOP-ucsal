package application;

import entities.Triangle;

public class Program
{

    public static void main(String[] args)
    {
        Triangle triangle1 = new Triangle(2.0, 3.0, 4.0);
        Triangle triangle2 = new Triangle(2.0, 3.0, 9.0);
        Triangle triangle3 = new Triangle(8.0);

        System.out.println("without method overloading");
        System.out.println(triangle1);
        System.out.println("value of perimeter = " + triangle1.perimeter());
        System.out.println();

        System.out.println("without method overloading");
        System.out.println(triangle2);
        System.out.println("value of perimeter = " + triangle2.perimeter());
        System.out.println();

        System.out.println("with method overloading");
        System.out.println(triangle3);
        System.out.println("value of perimeter = " + triangle3.perimeter());
        System.out.println();
    }
}