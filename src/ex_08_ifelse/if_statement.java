package ex_08_ifelse;

import java.util.Scanner;

public class if_statement {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18)
        System.out.println(" you allowed to vote ");
        else
        System.out.println("not allowed to vote ");
    }
}
