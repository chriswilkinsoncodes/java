package chapter2;

import java.util.Scanner;

/*******************************************************************************
 * TAU: Test Automation University - https://testautomationu.applitools.com    *
 * Chapter 2 - Java Fundamentals                                               *
 * Date created:  2023/02/14                                                   *
 * Date modified: 2023/02/14                                                   *
 *******************************************************************************/

public class GrossPayCalculator
{
    public static void main(String[] args)
    {
        // Get the number of hours worked
        System.out.println("Enter the number of hours worked: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // Get the hourly pay rate
        System.out.println("Enter the pay rate: ");
        double payRate = scanner.nextDouble();
        scanner.close();
        
        // Multiply hours and pay rate
        double grossPay = hours * payRate;

        // Display result
        System.out.println("Gross Pay is: $" + grossPay);
    }
}
