package task_examquestions;

import java.util.Scanner;

public class Q7_23JUNE {
    //Find the Largest of Three Numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number1:");
        int number1 = scanner.nextInt();
        System.out.println("enter the number2:");
        int number2 = scanner.nextInt();
        System.out.println("enter the number3:");
        int number3 = scanner.nextInt();
        if (number1 > number2 || number1 > number3) {
            System.out.println("this is the largest of three number:"  +number1);
        } else if(number2 > number1 || number2 > number3) {
            System.out.println("this is the largest of three number:"  +number2);

        } else {
            System.out.println("this is the largest of three number:" +number3);

        }
    }
}
