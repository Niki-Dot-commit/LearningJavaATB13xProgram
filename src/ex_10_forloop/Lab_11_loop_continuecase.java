package ex_10_forloop;

public class Lab_11_loop_continuecase {
    public static void main(String[] args) {
        for(int i =0 ;i<50;i++){
            if(i==5) {
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
