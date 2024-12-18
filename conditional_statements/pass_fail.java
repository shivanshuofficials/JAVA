package conditional_statements;
import java.util.*;
 public class pass_fail {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
         String type = (marks >= 33 && marks <= 100) ? "Pass" : "Fail";
         System.out.println("Your result is " + type);
    }
    }
 }