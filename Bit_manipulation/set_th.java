package Bit_manipulation;

public class set_th {
    public static int setithbit(int n, int i){
        int bitmask = 1<<i;
        return n |bitmask;

    }
    public static void main(String[] args) {
        System.out.println(setithbit(10,2));
    }
}
