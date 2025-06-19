package task_examquestions;

import java.util.Scanner;

public class Q6_23June {
    //) Find the Smallest of Two Numbers.
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the firstno: ");
        int firstno = scanner.nextInt();
        System.out.println("Enter the secondno: ");
        int secondno = scanner.nextInt();
        if(firstno>secondno){
            System.out.println("second no. is greater than firstno.");
        }
        else{
            System.out.println("first no. is smallest than second no.");
        }

    }
}
