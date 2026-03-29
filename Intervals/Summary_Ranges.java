package Intervals;

import java.util.ArrayList;

public class Summary_Ranges {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 4, 5, 7 };
        ArrayList<String> list = new ArrayList<>();

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int start = nums[i];

            while (i < n - 1 && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            if (start == nums[i]) {
                list.add(String.valueOf(start));
            } else {
                list.add(start + "->" + nums[i]);
            }
        }
        System.out.println(list);
    }

}
