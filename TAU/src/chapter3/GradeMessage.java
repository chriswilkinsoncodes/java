package chapter3;

import java.util.Scanner;

/*******************************************************************************
 * TAU: Test Automation University - https://testautomationu.applitools.com    *
 * Chapter 3e - switch statement                                               *
 * Description:                                                                *
 * - get letter grade from user and output appropriate message                 *
 * - A -> "Excellent job!"                                                     *
 * - B -> "Great job!"                                                         *
 * - C -> "Good job!"                                                          *
 * - D -> "Good try!"                                                          *
 * - F -> "Keep trying!"                                                       *
 * Date created:  2023/02/16                                                   *
 * Date modified: 2023/02/16                                                   *
 *******************************************************************************/

public class GradeMessage
{
    public static void main(String[] args)
    {
        // Get letter grade from user
        System.out.print("Enter letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        // Get message based on grade
        String message;

        switch (grade)
        {
            case "A", "a":
                message = "Excellent job!";
                break;
            case "B", "b":
                message = "Great job!";
                break;
            case "C", "c":
                message = "Good job!";
                break;
            case "D", "d":
                message = "Good try!";
                break;
            case "F", "f":
                message = "Keep trying!";
                break;
            default:
                message = "Error. Invalid grade.";
                break;
        }

        // Output result
        System.out.println(message);
    }
}
