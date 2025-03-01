package Bit_manipulation;

public class clear_last_ith {
    public static int clear(int n, int i) {
        int bitmask =(~0)<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clear(15, 2));
    }
}
