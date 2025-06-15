package ex_09_switchstatement;

import java.util.Scanner;

public class Lab_002switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 int day = scanner.nextInt();
 switch (day) {
            case 1:
                System.out.println("Mon");
                 break;
            case 2:
                System.out.println("tues");
                break;
            default :
                System.out.println("nothing correct");
 }

    }
}
