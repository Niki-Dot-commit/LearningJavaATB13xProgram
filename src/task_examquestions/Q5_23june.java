package task_examquestions;

import java.util.Scanner;

public class Q5_23june {
  //  Check if a Person is Eligible to Vote (Age Check).
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        if(age>=18){
            System.out.println("you'r eligible to vote");
        }
        else{
            System.out.println("you'r not eligable for vote");
        }


    }
}
