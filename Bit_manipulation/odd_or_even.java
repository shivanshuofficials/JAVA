package Bit_manipulation;

public class odd_or_even {
    public static void oddOrEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        // Check if a number is odd or even
        // If the last bit is 1, then the number is odd
        // If the last bit is 0, then the number is even
        oddOrEven(5);
        oddOrEven(6);
        oddOrEven(7);
    }
    
}
