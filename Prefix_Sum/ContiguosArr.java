package Prefix_Sum;

import java.util.HashMap;

public class ContiguosArr {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 1, 1, 1, 0, 0, 0 };
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, -1);
        int maxlength = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }
            if (mpp.containsKey(sum)) {
                int previdx = mpp.get(sum);
                int currentlength = i - previdx;
                maxlength = Math.max(maxlength, currentlength);

            } else {
                mpp.put(sum, i);
            }
        }
        System.out.println(maxlength);
    }

}
