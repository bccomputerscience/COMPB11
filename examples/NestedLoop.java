/*
    An example of nexted loops
*/

import java.util.Scanner;

public class NestedLoop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer value: ");
        int value = input.nextInt();

        for(int i = 0; i < value; i++)
        {
            for(int j = 0; j < value; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}