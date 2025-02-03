package arrays;
import java.util.*;

public class max_subarr {
    public static void subarr(int num[]) {
        int currsum =0;
         int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {// start
            int start = i;
            for (int j = i; j < num.length; j++) {// end
                int end = j;
                currsum =0;
                for (int k = start; k <= end; k++) {// print values
                        currsum += num[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum subarray sum is " + maxsum);
    }
    
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        subarr(num);
    }
}
