package conditional_statements;
import java.util.*;

public class switch_statement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the day (e.g., Monday, Tuesday, etc.):");
            String day = sc.nextLine().toLowerCase(); // Convert input to lowercase for case insensitivity
            
            switch (day) {
                case "monday":
                    System.out.println("chest");
                    break;
            
                case "tuesday":
                    System.out.println("biceps");
                    break;
            
                case "wednesday":
                    System.out.println("lats");
                    break;
            
                case "thursday":
                    System.out.println("legs");
                    break;
                    
                case "friday":
                    System.out.println("triceps");
                    break;
                    
                case "saturday":
                    System.out.println("abs");
                    break;
            
                default:
                    System.out.println("holiday");
                    break;
            }
        }
    }
}
