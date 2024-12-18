package loops;

public class reverse2 {
    public static void main(String[] args) {
     int n = 10804;
     int rev = 0;
     while (n > 0) {
      int  last_digit = n % 10;
        rev = rev * 10 + last_digit ;
        n /= 10;
 
     }
     System.out.println(rev);
    }
}
