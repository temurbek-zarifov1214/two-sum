package com.company;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Check for null or empty array
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements");
        }
        for (int i = 0; i <= nums.length-1; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
               if ((a+nums[j])==target)
               {
                   return new int[]{i, j};
               }
            }
        }
        // If no solution is found
        throw new IllegalArgumentException("No solution found");
    }
}
