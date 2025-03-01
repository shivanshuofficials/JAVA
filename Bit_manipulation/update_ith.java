package Bit_manipulation;
public class update_ith {
    public static int clear(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }


        public static int setithbit(int n, int i) {
            int bitmask = 1 << i;
            return n | bitmask;
        }

        

        public static int updateIthBit(int n, int i, int newbit) {
            if (newbit == 0) {
                return clear(n, i);
            } else {
                return setithbit(n, i);

            }
        }

        public static void main(String[] args) {

            System.out.println(updateIthBit(10, 2, 1));
        }
    }
