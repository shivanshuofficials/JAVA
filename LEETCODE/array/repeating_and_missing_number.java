package LEETCODE.array;

import java.util.*;

public class repeating_and_missing_number { // Changed from Solutions to Solution
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int num = grid.length;
        Set<Integer> nm = new HashSet<>();
        int ans[] = new int[2];
        
        // Find the repeated number
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (nm.contains(grid[i][j])) {
                    ans[0] = grid[i][j];
                }
                nm.add(grid[i][j]);
            }
        }

        num *= num;
        
        // Find the missing number
        for (int i = 1; i <= num; i++) {
            if (!nm.contains(i)) {
                ans[1] = i;
                break;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        // Test case
        repeating_and_missing_number solution = new repeating_and_missing_number();
        int[][] grid = {{1, 3}, {2, 2}};
        int[] result = solution.findMissingAndRepeatedValues(grid);
        System.out.println("Repeated: " + result[0] + ", Missing: " + result[1]);
    }
}
