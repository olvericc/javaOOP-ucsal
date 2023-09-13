package utils;

import java.util.Scanner;

public class Menu
{
    public static int showMenu(Scanner sc)
    {
        int option;

        do
        {
            System.out.println("Please choose one of the options below according to the respective number: ");

            System.out.println("+---------------------+");
            System.out.println("| 1 ........ Deposit  |");
            System.out.println("| 2 ........ Withdraw |");
            System.out.println("| 3 ........ Balance  |");
            System.out.println("| 4 ........ Exit     |");
            System.out.println("+---------------------+");

            System.out.println("Type the number: ");

            option = sc.nextInt();

        }
        while (option < 1 || option > 4);

        return option;
    }
}