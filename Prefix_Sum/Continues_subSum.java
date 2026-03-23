package Prefix_Sum;

import java.util.HashMap;

public class Continues_subSum {
    public static void main(String[] args) {
        int[] nums = { 23, 2, 4, 6, 7 };
        int k = 6;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, -1);
        int prefixsum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixsum += nums[i];

            int remainder = prefixsum % k;
            if (mpp.containsKey(remainder)) {
                int idx = mpp.get(remainder);
                if (i - idx >= 2) {
                    System.out.println("True");
                }
            } else {
                mpp.put(remainder, i);
            }

        }
        System.out.println("False");

    }

}
