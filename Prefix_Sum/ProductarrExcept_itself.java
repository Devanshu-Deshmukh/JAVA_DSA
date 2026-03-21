package Prefix_Sum;

import java.util.Arrays;

public class ProductarrExcept_itself {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix *= nums[i + 1];
            arr[i] *= suffix;
        }
        System.out.println(Arrays.toString(arr));
    }

}
