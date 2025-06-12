package ex_05_Ternaryoperator;

public class task_printmaxno {
    public static void main(String[] args) {
        int A = 10 ;
        int B = 20 ;

        //Find Max of Two Numbers using Ternary Operators
       int result_max = A<B ? B:A ;
        System.out.println(result_max);
    }
}
