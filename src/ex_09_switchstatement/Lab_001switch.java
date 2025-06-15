package ex_09_switchstatement;

import java.util.Scanner;

public class Lab_001switch {
    public static void main(String[] args) {
        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the days 1 to 7");
        int day = scanner.nextInt();
 switch(day) {
     case 1:
         System.out.println("Mon");
         break;
     case 2:
         System.out.println("tues");
 break;
     case 3:
         System.out.println("Wed");
         break;
     case 4:
         System.out.println("Thurs");
         break;
         case 5:
         System.out.println("Fri");
         break;
     case 6:
         System.out.println("Sat");
         break;
         case 7:
         System.out.println("Sun");
         break;
     default:
         System.out.println("Not allowed");
         break;
 }
    }
}
