package chapter3;

import java.util.Scanner;

/*******************************************************************************
 * TAU: Test Automation University - https://testautomationu.applitools.com    *
 * Chapter 3 - If Statements                                                   *
 * Date created:  2023/02/15                                                   *
 * Date modified: 2023/02/15                                                   *
 * Description:                                                                *
 * - all salespeople get a weekly payment of $1000                             *
 * - salespeople with more than 10 sales get a $250 bonus                      *
 *******************************************************************************/

public class SalaryCalculator
{
    public static void main(String[] args)
    {
        // Initialize know values
        double weeklySalary = 1000.00;
        double bonus = 250.00;
        int quota = 10;

        // Get values for unknown items
        System.out.print("How many sales were completed this week? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Adjusts for sales > 10, if applicable
        if (sales > quota) {
            weeklySalary += bonus;
        }

        // Output results
        System.out.println("This week's total salary is: $" + weeklySalary);
    }
}
