package Sliding_Window;

import java.util.HashMap;

public class MostK_FreqLong {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 2, 3, 1, 2 };
        int k = 2;
        int left = 0;
        int maxleng = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int right = 0; right < nums.length; right++) {
            int current = nums[right];
            mpp.put(current, mpp.getOrDefault(current, 0) + 1);
            if (mpp.get(current) > k) {
                int leftcurrent = nums[left];
                mpp.put(leftcurrent, mpp.get(leftcurrent) - 1);
                left++;
            }
            maxleng = Math.max(maxleng, right - left + 1);

        }
        System.out.println(maxleng);
    }

}
