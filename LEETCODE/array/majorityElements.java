package LEETCODE.array;
import java.util.*;

public class majorityElements {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;  
        for(int num:nums){
            if(count==0){
                candidate = num;
            }
            if(num==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            int[] nums = new int[n];
            //print the majority element in the array
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();
            }
            System.out.println(majorityElement(nums));
        
    }
}