package Arrays;

import java.util.HashMap;

public class Long_SubArrSum_0 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int[] nums = { 1, -1, 3, 2, -2, -8, 1, 7, 10, 23 };
        int maxi = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 0) {
                maxi = i + 1;

            } else {
                if (mpp.get(sum) != null) {
                    maxi = Math.max(maxi, i - mpp.get(sum));
                } else {
                    mpp.put(sum, i);
                }
            }
        }
        System.out.println(maxi);
    }

}
