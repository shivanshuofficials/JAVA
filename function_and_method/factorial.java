package function_and_method;
import java.util.*;
public class factorial {
    public static void factorial(int n) {
        int f =1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of "+n+" is "+f);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        factorial(n);
    }
}
