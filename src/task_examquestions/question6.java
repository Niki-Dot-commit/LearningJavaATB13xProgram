package task_examquestions;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        System.out.println("enter the no");
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >=0) {
            System.out.println("number is positive");
        }  else {
            System.out.println("number is negative");
        }

    }
}
