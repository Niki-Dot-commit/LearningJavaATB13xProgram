package static_instance_finalvariable_localvariable;

public class practice1 {
    static void  staticmethod(){
        System.out.println("app: Beactive");
    }

    void nonstatic(){
        System.out.println("user:Nikita");
    }

    public static void main(String[] args) {
        staticmethod() ;
        practice1 obj = new practice1();
        obj.nonstatic();
    }
}
