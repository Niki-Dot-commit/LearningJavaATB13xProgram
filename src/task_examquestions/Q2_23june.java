package task_examquestions;

import java.util.Scanner;

public class Q2_23june {

    //Check if a Number is Even or Odd.
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter any number");
        int i = scanner.nextInt();
        if(i%2==0){
            System.out.println("This no.is even:-"   +i);
        }
        else {
            System.out.println("This no.is odd:-"   +i);
        }



    }
}
