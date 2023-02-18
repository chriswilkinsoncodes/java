package chapter3;

import java.util.Scanner;

/*******************************************************************************
 * TAU: Test Automation University - https://testautomationu.applitools.com    *
 * Chapter 3b - if else statements                                             *
 * Date created:  2023/02/15                                                   *
 * Date modified: 2023/02/15                                                   *
 * Description:                                                                *
 * - all salespeople are expected to make at least 10 sales each week          *
 * - for those who do, they receive a congratulatory message                   *
 * - for those who don't, they are informed of how many sales they were short  *
 *******************************************************************************/

public class QuotaCalculator
{
    public static void main(String[] args)
    {
        // initiate known value(s)
        int quota = 10;

        // get unknown value(s)
        System.out.print("Enter number of sales this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // compare sales to quota and output result
        if (sales >= quota)
        {
            System.out.println("Congratulations! You met the weekly quota.");
        }
        else
        {
            // determine how many sales were short of the quota
            int deficiency = quota - sales;
            System.out.println("Try again next week. You were short " + deficiency + " sales.");
        }
    }
}
