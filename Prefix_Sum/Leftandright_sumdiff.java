package Prefix_Sum;

import java.util.Arrays;

public class Leftandright_sumdiff {
    public static void main(String[] args) {
        int[] nums = { 10, 4, 8, 3 };
        int[] arr = new int[nums.length];
        int leftsum = 0;
        int rightsum = 0;
        int totalsum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalsum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            rightsum = totalsum - leftsum - nums[i];
            arr[i] = Math.abs(leftsum - rightsum);
            leftsum += nums[i];
        }
        System.out.println(Arrays.toString(arr));
    }

}
