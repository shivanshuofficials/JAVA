package pattern;
import java.util.*;
public class inverted_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i =1; i<=n;i++){
            for (int j = 1; j <= (n-i+1); j++) {//n-i +1 is the logic to invert the star pattern
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
