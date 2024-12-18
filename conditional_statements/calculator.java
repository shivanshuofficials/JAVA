package conditional_statements;
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the operator: ");
            char operator = sc.next().charAt(0);
            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();
            switch (operator) {
                case '+':
                    System.out.println("sum : " + (num1+num2));
                    break;
                case '-':
                    System.out.println(""+ (num1 - num2));
                    break;
                case '*':
                    System.out.println("sum : " + (num1*num2));
                    break;
                case '/':
                    System.out.println("sum : " + (num1/num2));
                    break;
                case '%':
              System.out.println("sum : " + (num1%num2));

                    break;
            
                default:
                System.out.println("Invalid operator");
                    break;
            }
        }
    }
}
