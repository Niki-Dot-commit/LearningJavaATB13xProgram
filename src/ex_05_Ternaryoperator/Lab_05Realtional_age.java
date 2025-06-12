package ex_05_Ternaryoperator;

public class Lab_05Realtional_age {
    public static void main(String[] args) {
        // age = 23
        //  age < 18 ->  Minor
        //  18 < age > 65 ->  Adult
        // age > 65 -> Senior Citizen
        int age =76;
        String result = (age<18)?"Minor" : (age>65) ? "Senior": "Adult";
        System.out.println(result);
    }
}
