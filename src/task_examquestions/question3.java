package task_examquestions;

public class question3 {
    public static void main(String[] args) {
        int a =3;
        int b =4;
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a > b: " + (a > b));   // false
        System.out.println("a < b: " + (a < b));   // true
        System.out.println("a != b: " + (a != b)); // true

        // Logical OR with conditions
        System.out.println("a > 2 || b < 2: " + (a > 2 || b < 2)); // true
    }
}
