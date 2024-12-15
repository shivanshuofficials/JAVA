package conditional_statements;
import java.util.*;
public class largest_2num {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number:" );
            int  num1 = sc.nextInt();
            System.out.print("Enter second number:" );
            int  num2 = sc.nextInt();
            if (num1 > num2) {
                System.out.println("fisrt is greater!" + num1);
            }
            else if (num1 == num2) {
                System.out.println("both are equal "  +num1 + "\t" + num2);
            }
            else{
                System.out.println("second is greater!" + num2);
            }
        }
    }
}
