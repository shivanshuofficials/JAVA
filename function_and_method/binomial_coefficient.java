package function_and_method;
import java.util.Scanner;

public class binomial_coefficient{

    public static int factorial(int n) {
        int f =1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of "+n+" is "+f);
        return f;
    }

    public static int bin_coeffi(int n, int r) {
       int fact_n = factorial(n);
       int fact_r = factorial(r);
       int fact_n_r = factorial(n-r);
       int answer  = fact_n/(fact_r*fact_n_r);
System.out.println(answer);
       return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    bin_coeffi(7, 1);

    }
}