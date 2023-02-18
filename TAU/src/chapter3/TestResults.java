package chapter3;

import java.util.Scanner;

/*******************************************************************************
 * TAU: Test Automation University - https://testautomationu.applitools.com    *
 * Chapter 3d - if else-if statements                                          *
 * Description:                                                                *
 *  - get numeric test grade from user and convert to letter grade             *
 *  - use if else-if                                                           *
 *  - A >= 80                                                                  *
 *  - B >= 70                                                                  *
 *  - C >= 60                                                                  *
 *  - D >= 50                                                                  *
 *  - F < 50                                                                   *
 * Date created:  2023/02/16                                                   *
 * Date modified: 2023/02/16                                                   *
 *******************************************************************************/

public class TestResults
{
    public static void main(String[] args)
    {
        // Get test score from user
        System.out.print("What is the test score? ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        // Determine letter grade
        char grade;
        if (score >= 80)
            grade = 'A';
        else if (score >= 70)
            grade = 'B';
        else if (score >= 60)
            grade = 'C';
        else if (score >= 50)
            grade = 'D';
        else
            grade = 'F';

        // Output result
        System.out.println("Your letter grade is " + grade);
    }
}
