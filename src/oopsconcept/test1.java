package oopsconcept;
class Dog {
    Dog() {
        System.out.println("Dog is Animal");
    }
    void bark(){
        System.out.println("Dog is Barking");
    }
    void eat (){
        System.out.println("Dog is eating ");
    }
}
public class test1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}

