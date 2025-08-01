package oopsconcept;
class Login {
    Login(){
        System.out.println("Your account login sucesfull");
    }
    void email(){
        System.out.println("email: nikita@yopmail.com");
    }
    void password(){
        System.out.println("password:Pass@123");
    }

}
public class exam2 {
    public static void main(String[] args) {
       Login l = new Login();
       l.email();
       l.password();




    }
}

