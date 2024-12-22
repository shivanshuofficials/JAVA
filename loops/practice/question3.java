import java.util.*;
public class question3 {
    public static void main(String[] args) {
        int fact = 1;
        int num,i;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number :");
     num = sc.nextInt();
     for (i = 1; i <=num; i++) {
        fact = fact * i;
    }
    System.out.println("Factorial : " + fact);
}

}
