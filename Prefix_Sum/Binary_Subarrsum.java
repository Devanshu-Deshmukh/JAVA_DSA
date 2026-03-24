package Prefix_Sum;

import java.util.HashMap;

public class Binary_Subarrsum {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 0, 1 };
        int goal = 2;
        int currentsum = 0;
        int count = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            currentsum += nums[i];

            int target = currentsum - goal;
            if (mpp.containsKey(target)) {
                count += mpp.get(target);
            }
            mpp.put(currentsum, mpp.getOrDefault(currentsum, 0) + 1);
        }
        System.out.println(count);
    }

}
