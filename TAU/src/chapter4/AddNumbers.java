package chapter4;

import java.util.Scanner;

/*******************************************************************************
 * TAU: Test Automation University - https://testautomationu.applitools.com    *
 * Chapter 4b - do-while loop                                                  *
 * Description:                                                                *
 *  - get numbers from users                                                   *
 *  - add numbers                                                              *
 *  - output sum                                                               *
 *  - ask user whether to run again                                            *
 * Date created:  2023/02/17                                                   *
 * Date modified: 2023/02/17                                                   *
 *******************************************************************************/

public class AddNumbers
{
    public static void main(String[] args)
    {
        boolean again;

        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.print("Enter the first integer to be added: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second integer to be added: ");
            int num2 = scanner.nextInt();

            System.out.println("The sum of the numbers is: " + (num1 + num2));

            System.out.println("Add more numbers? (true/false)");
            again = scanner.nextBoolean();

        } while (again);
        scanner.close();
    }
}
