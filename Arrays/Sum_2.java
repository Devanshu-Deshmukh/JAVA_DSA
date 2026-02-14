package Arrays;

import java.util.HashMap;

public class Sum_2 {
    public static int[] sum(int[] nums, int target) {
        HashMap<Integer, Integer> mapp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (mapp.containsKey(need)) {
                return new int[] { mapp.get(need), i };
            }
            mapp.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 7, 1, 9 };
        int target = 8;
        int[] result = sum(nums, target);
        if (result.length == 2) {
            System.out.println("The indices of the two numbers that add up to " + target + " are: " + result[0]
                    + " and " + result[1]);
        } else {
            System.out.println("No two numbers add up to " + target);
        }
    }
}
