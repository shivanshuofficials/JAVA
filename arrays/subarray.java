package arrays;
import java.util.*;
public class subarray {
    public static void subarr(int num[]) {
        for (int i = 0; i < num.length; i++) {//start
            int start = i;
            for (int j = i; j < num.length; j++) {//end
                int end = j;
                for (int k = start; k <= end; k++) {//print values
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};//array
        subarr(num);//call function
    }
}
