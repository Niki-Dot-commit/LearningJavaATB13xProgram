package ex_012_do_while;

import java.util.Scanner;

public class Lab_001_checkvowel {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the alphabetic char");
        char ch=scanner.next().toLowerCase().charAt(0);
        switch (ch){
            case  'a','e','i','o','u':
                System.out.println("its a vowel");
                break;
            default:
                System.out.println("its a consonant");
        }
    }
}
