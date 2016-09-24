/*
    An example of a menu system in a while loop
*/

import java.util.Scanner;

public class WhileMenu
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char choice = 'Z';

        while(choice != 'X')
        {
            System.out.println("Welcome to the Menu System.");
            System.out.println("Enter \'A\' option A ");
            System.out.println("Enter \'B\' option B ");
            System.out.println("Enter \'X\' to Exit ");
            System.out.println("Please enter your choice: ");
            choice = input.next().charAt(0);
            choice = Character.toUpperCase(choice);

            switch(choice)
            {
                case 'A': System.out.println("Your choice was \'A\'");
                    break;
                case 'B': System.out.println("Your choice was \'B\'");
                    break;
                case 'X':
                    break;
                default: System.out.println("You entered an invalid choice.");
                    System.out.println("Please enter your choice: ");
                    choice = input.next().charAt(0);
                    choice = Character.toUpperCase(choice);
                    break;
            }
        }
        System.out.println("Goodbye.");

    }
}