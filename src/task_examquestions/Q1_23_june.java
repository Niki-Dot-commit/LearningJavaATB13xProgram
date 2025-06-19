package task_examquestions;

import java.util.Scanner;

public class Q1_23_june {
    public static void main(String[] args) {
        //Check if a Number is Positive or Negative.
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the no:-");
        int i = scanner.nextInt(); // read number by user
        if(i>0 ){
            System.out.println("no is positive: " +i);
        }
        else {
            System.out.println("no is negative : " +i);
        }


    }

}
