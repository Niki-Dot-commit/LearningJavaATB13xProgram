package ex_10_forloop;

import java.util.Scanner;

public class Lab_013_task {
    public static void main(String[] args) {
        // Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4
        System.out.println("enter your name:");
        Scanner scanner =new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        for (int i = 0 ;i < input.length();i++){
            char ch = input.charAt(i);
            //check if its letter1`
            if(ch>='A' && ch<='z'){
                if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')

                System.out.println(ch + ":-its a vowel");
            } else {
                System.out.println(ch+ ":-its a consonant");
            }
        }



    }


    }

