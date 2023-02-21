package chapter3;

import java.util.Scanner;

/*******************************************************************************
 * TAU: Test Automation University - https://testautomationu.applitools.com    *
 * Chapter 3f - Relational and Logical Operators                               *
 * Date created:  2023/02/17                                                   *
 * Date modified: 2023/02/17                                                   *
 * Description:                                                                *
 * - to qualify for a loan, a person must:                                     *
 *   - make at least $30,000                                                   *
 *   - have been working at their current job for at least 2 years             *
 *******************************************************************************/

public class LogicalOperatorLoanQualifier
{
    public static void main(String[] args)
    {
        // initialize known values
        int minSalary = 30000;
        int minYearsAtJob = 2;

        // get unknown values
        System.out.print("Enter current salary: ");
        Scanner scanner = new Scanner(System.in);
        double currSalary = scanner.nextDouble();
        System.out.print("Enter years at current job: ");
        double yearsAtJob = scanner.nextDouble();
        scanner.close();

        // compare values and generate output
        if ((currSalary >= minSalary) && (yearsAtJob >= minYearsAtJob))
        {
            System.out.println("Congratulations! You qualify for a loan.");
        }
        else
        {
            System.out.println("Sorry, you do not currently qualify for a loan.");
        }
    }
}
