package ex_07_Increment_decrement;

public class Lab_069_Indep_op {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a; // 10+1 assigned // pre - increment
        System.out.println(a);
        System.out.println(b);


        //  Exp and Result Table
        // Line No | a | Result b
        //  5 |  10 |  NA
        // 6  |  11 |  11
        // 7  | 11(NA) | 11
        // 8  | 11 | 11(NA)

    }
}
