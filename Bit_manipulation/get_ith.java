package Bit_manipulation;

public class get_ith {
    public static int getIthBit(int n, int i) {
        int mask = 1 << i;
        if( (n & mask) == 0 ){
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
       
        System.out.println(getIthBit(5,3 ));
    }
}
