package Arrays;

import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 4 };
        int left = 0;
        int right = nums.length - 1;
        // left pointer: Start (index 0) par khada hoga.Iska kaam hai Even numbers ko
        // check karna.
        // right pointer: End (index n-1) par khada hoga. Iska kaam hai Odd numbers ko
        // check karna.
        while (left < right) {
            if (nums[left] % 2 == 0) {
                left++;
            } else if (nums[right] % 2 != 0) {
                right--;
            } else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
