package ex_06_userinput;

public class Lab_01User_input {
    public static void main(String[] args) {
        String age_string =args[0];
        System.out.println(age_string);
        int age =Integer.parseInt(age_string);
        String canivote = age >=18 ? "Yes":"NO";
        System.out.println(canivote);
    }
}
