package static_instance_finalvariable_localvariable;

public class static_variable {
    static void staticmethod ()

    {  // static use in static variable
        System.out.println("i m static variable");
    }
void nonstaticmethod()
{     // only void use in non -static variable
    System.out.println(" i m non-static method");
}

    public static void main(String[] args) {
        staticmethod();  // direct method call no object need in static variable

    //calling non-static method
        static_variable obj =  new static_variable();
        obj.nonstaticmethod();

    }

}

