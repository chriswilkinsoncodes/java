package chapter2;

import java.util.Scanner;

/*******************************************************************************
 * TAU: Test Automation University - https://testautomationu.applitools.com    *
 * Chapter 2 - Java Fundamentals                                               *
 * Date created:  2023/02/14                                                   *
 * Date modified: 2023/02/14                                                   *
 *******************************************************************************/

public class MadLibs
{
    public static void main(String[] args)
    {
        // Ask user for a season of the year
        System.out.println("Enter a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // Ask user for a whole number
        System.out.println("Enter a whole number: ");
        int wholeNum = scanner.nextInt();

        // Ask user for an adjective
        System.out.println("Enter an adjective: ");
        String adjective = scanner.next();
        scanner.close();

        // Output result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNum + " cups of coffee.");
    }
}
