package conditional_statements;
import java.util.*;

public class if_else {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();

            // Check if the person is an adult
            if (age >= 18) {
                System.out.println("You are an adult.");
            } 
            // Check if the person is a teenager
            else if (age >= 13 && age < 18) {
                System.out.println("You are a teenager.");
            } 
            // Otherwise, the person is a child
            else {
                System.out.println("You are a child.");
            }
        }
    }
}
