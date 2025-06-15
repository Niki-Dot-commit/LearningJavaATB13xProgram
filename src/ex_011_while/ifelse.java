package ex_011_while;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        //User will enter a character.
        //You will check by using
        // if-else loop and give that if the character is a vowel or a consonant.

        Scanner scanner = new Scanner(System.in);
   //enter the character
        System.out.println("Enter the character");
        char character =scanner.next().toLowerCase().charAt(0); //convert to lower
        //check if character is letter
        if (character >= 'a' &&  character<= 'z'){
            if(character =='a'|| character=='e'||character=='i'||character=='o'||character=='u') {
                System.out.println("it is vowel");
            } else {
                System.out.println("its a consonant");
            }

        }


    }
}

