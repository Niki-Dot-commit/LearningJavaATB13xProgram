package static_instance_finalvariable_localvariable;

public class practice2 {
   static int a = 20 ;
   static  int b =20;

    static void multiply()
    {
        System.out.println("multiplication:" +(a*b) );
    }
    void addition(){
        System.out.println("addition: " +(a+b));
    }

    public static void main(String[] args) {
        multiply();
        practice2 obj = new practice2();
        obj.addition();

    }
}
