package loops;

import java.util.*;

public class prime_or_not {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if (n == 2) {
                System.out.println("prime number! ");
            } else {
                boolean isPrime = true;
                for (int i = 2; i < Math.sqrt(n); i++) {//math.sqrt(n) or n-1
                    if (n % i == 0) {
                        isPrime = false;
                    
                    }
                }
                if (isPrime == true) {
                    System.out.println("prime number!");
                } else {
                    System.out.println("not a prime number");
                }
            }
        }
    }
}
