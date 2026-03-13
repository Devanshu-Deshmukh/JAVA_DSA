package Sliding_Window;

import java.util.*;

public class Max_Erasure {
    public static void main(String[] args) {

        int[] nums = { 4, 2, 4, 5, 6 };
        // ismai unique subarray ka sum dena hai
        int left = 0;
        int maxsum = 0;
        int currentsum = 0;
        Set<Integer> set = new HashSet<>();
        for (int right = 0; right < nums.length; right++) {
            int current = nums[right];
            while (set.contains(current)) {
                set.remove(nums[left]);
                currentsum -= nums[left];
                left++;
            }
            set.add(current);
            currentsum += current;
            maxsum = Math.max(maxsum, currentsum);

        }
        System.out.println(maxsum);
    }

}
