package ex_07_Increment_decrement;

public class task_005 {
    public static void main(String[] args) {
        int x = 5;

        int y = x++ + ++x + x++ + ++x;
        // y= 5+7+7+9=28 ; x= 9

        System.out.println("x = " + x + ", y = " + y);
    }
}
