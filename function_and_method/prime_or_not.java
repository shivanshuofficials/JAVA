package function_and_method;

public class prime_or_not {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                System.out.println("this is not a prime number");
                break;
            }

        }
        return isPrime;
    }

    public static void range(int n) {
        for (int i = 1; i <= n; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        range(3);

    }

}
