import java.util.Scanner;

public class product {
     public static void main(String arg[]){
     try (Scanner sc = new Scanner(System.in)) {
        int a = sc.nextInt();
         int b = sc.nextInt();
         int product = a*b;
         System.out.println(product);
    }
    }
}

