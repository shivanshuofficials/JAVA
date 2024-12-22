package function_and_method;

import java.util.*;

public class function_with_parameters {

    public static int sum(int num, int num2) {
        int sum = num + num2;
        System.out.println("sum = "+sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your digit: ");
        int num = sc.nextInt();
        System.out.print("Enter your digit: ");
        int num2 = sc.nextInt();
        sum(num, num2);

    }
}
