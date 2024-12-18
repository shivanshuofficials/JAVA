package loops;

import java.util.*;

public class continue_ques {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          do {
              System.out.println("enter the number!");
              int n = sc.nextInt();
            if (n %10 == 0) {
              continue;
            }  
            System.out.println("number was :" + n);
          }while(true);
        }
    }
}
