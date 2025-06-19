package ex_013_function;

public class Lab_04_user_defined {
    public static void main(String[] args) {
        int result  = sum_of_number (2,3);
//sum_of_number_no_return(3,5);
        System.out.println(result);
    }
    static int  sum_of_number (int a ,int b){
        return a + b;
    }
//static void sum_of_number_no_return(int a ,int b){
  //  System.out.println(a+b);
    }

