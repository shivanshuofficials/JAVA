package arrays;

import java.util.*;

public class max_subarr2 {
    public class max_subarray2 {
        public static void subarr(int num[]) {
            int currsum = 0;
            int maxsum = Integer.MIN_VALUE;
            int prefix[]= new int [num.length];
            prefix[0]= num[0];

            //calculate prefix array
            for (int i = 1; i < prefix.length; i++) {
                prefix[i]=prefix[i-1]+num[i];

            }
            for (int i = 0; i < num.length; i++) {// start
                int start = i;
                for (int j = i; j < num.length; j++) {// end
                    int end = j;
                    currsum = start ==0 ? prefix[end] : prefix[end] - prefix[start - 1];

                   
                    if (maxsum < currsum) {
                        maxsum = currsum;
                    }
                }
            }
            System.out.println("Maximum subarray sum is " + maxsum);
        }

        public static void kadanes(int num[]) {
            int ms = Integer.MIN_VALUE;
            int cs =0;
            for (int i = 0; i < num.length; i++) {
                cs = cs + num[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(cs, ms);
            }
            System.out.println("maximum sum :"+ms);
        }




        public static void main(String[] args) {
            int num[] = {1, 2, 3, 4, 5};
            kadanes(num);
        }
    }
}