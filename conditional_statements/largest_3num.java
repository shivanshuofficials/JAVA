package conditional_statements;

import java.util.Scanner;

public class largest_3num {
      public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number:" );
            int  num1 = sc.nextInt();
            System.out.print("Enter second number:" );
            int  num2 = sc.nextInt();
            System.out.print("Enter third number:" );
            int  num3 = sc.nextInt();
            if (num1 > num2 && num1 > num3) {
                System.out.println("fisrt is greater!" + num1);
            }
            else if (num1 == num2) {
                System.out.println("all are equal "  +num1 + "\t" + num2 + "\t" + num3);
            }
            else if (num2> num1 && num2 > num3) {
                System.out.println("second is greater! "+ num2);
            }
            else{
                System.out.println("third is greater!" + num3);
            }
        }
    }
}
