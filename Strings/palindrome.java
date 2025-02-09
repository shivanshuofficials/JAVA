package Strings;
public class palindrome {
      public static boolean count( String palindrome) {
        int n = palindrome.length();
        for (int i = 0; i < palindrome.length() / 2; i++) {
          if ( palindrome.charAt(i) != palindrome.charAt(n-1-i)) {
              System.out.println("Not a palindrome");
              return true;
          }
        }
          if( palindrome.charAt(0) == palindrome.charAt(n-1)) {
                System.out.println("Palindrome");
          }
        
        return false;
    }
        public static void main(String[] args) {
        String palindrome = "racecar";
        count(palindrome);
}
}
