package ex_07_Increment_decrement;

public class Task_002 {
    public static void main(String[] args) {
        int i = 1;

        i = i++ + ++i;
        // i++ > ExpA -> 1 , i> 1,2
          //++i > exp -> 2 ,i>3
        // 1+3 =4
        System.out.println(i);
    }
}
