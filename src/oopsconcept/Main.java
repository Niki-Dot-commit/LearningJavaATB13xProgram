package oopsconcept;
class fan{
    fan() {
        System.out.println("fan is installed");
    }
    void rotate() {
        System.out.println("fan is rotating");
    }
}
public class Main {
    public static void main(String[] args) {
        fan f = new fan();
        f.rotate();


    }

}
