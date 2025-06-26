package task_examquestions;

import java.util.Scanner;

public class Q1_24june {
    public static void main(String[] args) {
        //Find the Smallest of Three Numbers.
Scanner scanner =new Scanner(System.in);
        System.out.println("enter the first no");
int firstno =scanner.nextInt();
        System.out.println("enter second no.");
        int secondno = scanner.nextInt();
        System.out.println("enter third no");
        int thirdno =scanner.nextInt();
        if(firstno<secondno && firstno< thirdno) {
            System.out.println(" first no is smallest no:" + firstno);
        } else if(secondno<firstno && secondno<thirdno){
            System.out.println("second no is smallest no:"+secondno);
            }
        else
        {
            System.out.println("thirs no is  smallest no.:" +thirdno);
        }

    }
}
