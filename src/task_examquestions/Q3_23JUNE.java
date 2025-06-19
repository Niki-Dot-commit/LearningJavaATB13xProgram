package task_examquestions;

import java.util.Scanner;

public class Q3_23JUNE {
    public static void main(String[] args) {
        //Find the Maximum of Two Numbers.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first no.= " );
        int firstno = scanner.nextInt();
        System.out.println("Enter the second no.= " );
        int secondno = scanner.nextInt();
        if (firstno > secondno) {
            System.out.println("output comes: firstno. is a maximum no.");
        } else if(secondno >firstno){
         System.out.println("output comes: second no is maximum no.");
        }
        else {
            System.out.println("output comes: both no.are equal");
        }
        }
    }

