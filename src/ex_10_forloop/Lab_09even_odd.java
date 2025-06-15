package ex_10_forloop;

public class Lab_09even_odd {
    public static void main(String[] args) {
        for(int i= 1 ;i<=50 ;i++){
            if(i%2==0) {
                System.out.println("even no.->"  +i);
            }
            else{
                System.out.println("odd no.->" +i);
            }
        }
    }
}
