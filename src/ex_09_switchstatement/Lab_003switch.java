package ex_09_switchstatement;

public class Lab_003switch {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch) {

            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");

        }
    }
}
