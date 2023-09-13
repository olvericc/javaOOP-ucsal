package application;

import entities.ArithmeticProgression;

public class Program
{

    public static void main(String[] args)
    {

        System.out.println("------");

        ArithmeticProgression ap1 = new ArithmeticProgression(2, 2);

        for (int i = 1; i <= 5; i++)
        {
            System.out.println(ap1.nextTerm());
        }
        System.out.println("------");

        ap1.setFirstTerm(3);

        for (int i = 1; i <= 5; i++)
        {
            System.out.println(ap1.nextTerm());
        }
        System.out.println("------");

        ap1.setReason(5);

        for (int i = 1; i <= 5; i++)
        {
            System.out.println(ap1.nextTerm());
        }
        System.out.println("------");

    }

}
