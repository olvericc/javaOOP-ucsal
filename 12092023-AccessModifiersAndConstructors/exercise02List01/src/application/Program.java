package application;

import entities.Account;
import utils.Menu;

import java.util.Scanner;

public class Program
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int option = 0;
        double value;

        Account acc1 = new Account("454fdn543", "Eric Lopes", 4899.99);

        while (option != 4)
        {
            option = Menu.showMenu(sc);

            switch (option) {
                case 1 -> {
                    System.out.println("Type a value: ");
                    value = sc.nextDouble();
                    if (acc1.deposit(value)) {
                        System.out.println("Operation carried out successfully.");
                    } else {
                        System.out.println("The operation could not be performed, please try again.");
                    }
                }
                case 2 -> {
                    System.out.println("Type a value: ");
                    value = sc.nextDouble();
                    if (acc1.withdraw(value)) {
                        System.out.println("Operation carried out successfully.");
                    } else {
                        System.out.println("The operation could not be performed, please try again.");
                    }
                }
                case 3 -> {
                    System.out.println();
                    System.out.println(acc1);
                    System.out.println();
                }
                case 4 -> System.out.println("End of the program.");
                default -> throw new IllegalStateException("Unexpected value: " + option);
            }
        }

        sc.close();
    }
}
