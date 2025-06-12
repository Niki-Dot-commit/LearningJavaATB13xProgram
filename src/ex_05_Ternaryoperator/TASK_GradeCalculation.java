package ex_05_Ternaryoperator;

public class TASK_GradeCalculation {
    public static void main(String[] args) {
        // Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
       int marks = 35 ; // value can chnage according to test.
String grade = (marks >=90) ? "grade A+"
                : (marks>=75)? "grade A"
                : (marks >=60)?"grade B"
                : (marks >=40)?"grade C"
                : "Fail";
        System.out.println("Marks:" + marks + "->" +grade);
    }
}
