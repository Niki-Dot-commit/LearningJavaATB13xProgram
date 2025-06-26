package task_examquestions;

import java.util.Scanner;

public class Q3_24_JUNE {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Marks:" );
        int marks = scanner.nextInt();

        /*
Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)
1️⃣ Take user input for marks (Use Scanner class).
2️⃣ Check the validity of marks (ensure they are between 0 and 100).
3️⃣ Use if-else-if conditions to determine the grade based on marks.
4️⃣ Display the grade as output
 */
        if  (marks<= 0 || marks>=100){
            System.out.println("Enter marks are invalid please enter correct marks");}
        else{
            // Step 3 & 4: Use if-else-if to assign grade
            if(marks>=90 && marks<=100) {
                System.out.println("A+ Grade");
            } else if(marks>=80 ){
                System.out.println("A Grade");
            } else if(marks>=70 ){
                System.out.println("B Grade");
            } else if(marks>=60){
                System.out.println("C Grade");
            } else if(marks>=50 ){
                System.out.println("D Grade");
            } else if(marks>=40 ){
            System.out.println("E Grade");
        } else {
                System.out.println("F Grade");
            }
        }
    }
}
