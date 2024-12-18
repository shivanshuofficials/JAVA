package loops;
import java.util.*;

public class break_ques {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Enter a number");
                int n = sc.nextInt();
                if (n % 10 == 0) {
                    System.out.println("i am out");
                    break;
                }
                System.out.println(n);
            } while (true);
        }
    }
}
