package application;

import entities.ArithmeticProgression;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArithmeticProgression ap1 = new ArithmeticProgression();

        System.out.println("Please type a number: ");
        int number = sc.nextInt();

        for (int i = 1; i < number; i++)
        {
            System.out.println(ap1.nextTerm());
        }
    }
}
