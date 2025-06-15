package ex_10_forloop;

public class Lab_12_loop_continue_even {
    public static void main(String[] args) {
        for(int i=0; i<100 ;i++){
            // no of even or odd
            if (i%2 ==0 ) {
                continue;
            } else{
                System.out.println("no. is odd ->" +i );
            }
        }
    }
}
