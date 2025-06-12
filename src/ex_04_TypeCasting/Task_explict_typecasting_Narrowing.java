package ex_04_TypeCasting;

public class Task_explict_typecasting_Narrowing {
    public static void main(String[] args) {
        //Casts a double to an int, cutting off decimals value.
        double A = 2344.050 ;
        int A1 = (int) A ;
        System.out.println(A1);
    }
}
