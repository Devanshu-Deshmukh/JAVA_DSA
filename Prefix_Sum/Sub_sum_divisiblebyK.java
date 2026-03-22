package Prefix_Sum;

import java.util.HashMap;

public class Sub_sum_divisiblebyK {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 0, -2, -3, 1 };
        int k = 5;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        int prefixsum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixsum += nums[i];
            int remainder = (prefixsum % k + k) % k;
            if (mpp.containsKey(remainder)) {
                count += mpp.get(remainder);
            }
            mpp.put(remainder, mpp.getOrDefault(remainder, 0) + 1);
        }
        System.out.println(count);

    }

}
