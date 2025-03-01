package Bit_manipulation;

public class clear_ith_bit {
    public static int clear(int n ,int i) {
        int bitmask = (~0)<<i;
        return n & bitmask;
        //~0 = 11111111
    }
    public static void main(String[] args) {
        System.out.println( clear(15, 2) );
        // 15 = 1111
        // 2nd bit from right is 0
        // 12 = 1100
    }
}
//15 = 1111 = 1100