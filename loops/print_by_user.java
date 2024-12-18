package loops;
import java.util.*;
public class print_by_user {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the value :");
            int n = sc.nextInt();
            int counter =1;
            while (counter <= n) {
                System.out.println(n +" is equal to index "+ counter);
                counter++;
            }
        }
        System.out.println("loop end");
    }
}
