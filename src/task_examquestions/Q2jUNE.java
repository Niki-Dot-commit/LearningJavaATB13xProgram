package task_examquestions;

import java.util.Scanner;

public class Q2jUNE {
    public static void main(String[] args) {
        // Check if a Year is a Leap Year.
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
       /*formula for check leap year
       It is divisible by 4 AND
         Not divisible by 100 UNLESS it is also divisible by 400
        */
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("this year is leap year ");
        } else {
            System.out.println("this year is not a leap year");
        }
    }

}