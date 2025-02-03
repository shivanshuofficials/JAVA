package arrays;
// import java.util.Scanner;

public class trap_water {
    public static int trappedwater(int height[]) {//function
    int n = height.length;

    //left max array
    int leftmax[]= new int[n];
    leftmax[0]=height[0];
    for (int i = 1; i < n; i++) {
        leftmax[i]= Math.max(height[i], leftmax[i-1]);
    }

    //right max array
    int rightmax[]= new int[n];
    rightmax[n-1]=height[n-1];
        for (int i = n-2; i >= 0; i--) {
         rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        // trapped water
        int rainwater=0;
        for (int i = 0; i < n; i++) {
            int water_level =Math.min(leftmax[i],rightmax[i]);
            rainwater += water_level-height[i];

        }
        return rainwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};//array
        System.out.println(trappedwater(height));//function call
    }
}
