package task_examquestions;

import java.util.Scanner;

public class Q4_23JUNE {
    //Check if a Character is a Vowel or Consonant.
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("enter a character:");
        char ch = scanner.next().toLowerCase().charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("its a vowel");
        }
        else{
            System.out.println("its a consonant");
        }
    }
}
