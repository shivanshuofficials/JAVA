package pactice_question;

import loops.sum;

public class question2 {
    public static void sum(int nums[][]) {
      
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (i ==1) {
                    sum += nums[i][j];
                }
            }
        }
            System.out.println("Sum of the second row of the 2D array is: " + sum);
    }

    public static void main(String[] args) {
        int nums[][] = { { 1, 4, 9 }
                         ,{ 11, 4, 3}, 
                         { 2, 2, 3 } };
                         sum(nums);
      
        }
        }
