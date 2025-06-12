package ex_05_Ternaryoperator;

public class TASK_EVEN_ODD {
    public static void main(String[] args) {
        int A =19;
        String result = (A%2 ==0) ? "A IS EVEN" : "A IS ODD";
        String result1 =((A+1)%2==0) ?"A IS EVEN" : "A IS ODD";
        System.out.println(result);
        System.out.println(result1);
    }
}
