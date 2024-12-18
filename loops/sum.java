package loops;
import java.util.*;
public class sum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;
            int counter = 1;
            while (counter <= n) {
                sum += counter;
                counter ++;
                
            }
            System.out.println("sum is p"+sum);
        }
    }
}
