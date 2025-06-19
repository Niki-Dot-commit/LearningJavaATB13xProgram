package task_examquestions;

public class question5 {
    public static void main(String[] args) {


    int a  = 100;
    float b  = 18.45f;
    //        int total = a+b; // Narrow - Implicit
    int total1 = a +(int) b; // Narrow - Explict
        System.out.println(total1);


    float total2 = a +b; // Widening - auto - implicit
    float total3 = (float)a+b; // Widening  - Explicit
        System.out.println(total2);
        System.out.println(total3);
}
}
