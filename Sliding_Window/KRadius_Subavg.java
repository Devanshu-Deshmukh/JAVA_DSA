package Sliding_Window;

import java.util.Arrays;

public class KRadius_Subavg {
    public static void main(String[] args) {
        int[] nums = { 7, 4, 3, 9, 1, 8, 5, 2, 6 };
        int k = 3;
        int n = nums.length;
        int windowsize = 2 * k + 1;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        int window = 0;
        int i = k;
        int left = 0;
        int right = 2 * k;
        if (windowsize > n) {
            System.out.println(Arrays.toString(result));
        }

        for (int j = left; j <= right; j++) {
            window += nums[j];
        }
        result[i] = (int) (window / windowsize);
        i++;
        right++;
        while (right < n) {
            int newv = nums[right];
            int old = nums[left];
            window = window + newv - old;
            result[i] = (int) (window / windowsize);
            i++;
            right++;
            left++;
        }
        System.out.println(Arrays.toString(result));
    }

}
