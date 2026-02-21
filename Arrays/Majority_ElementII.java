package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Majority_ElementII {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 3, 3, 2, 2, 2 };
        int count1 = 0;
        int count2 = 0;
        int candidate1 = 0;
        int candidate2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) {
                count1++;

            } else if (nums[i] == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;

            }

        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) {
                count1++;
            } else if (nums[i] == candidate2) {
                count2++;
            }
        }
        List<Integer> result = new ArrayList<>();
        if (count1 > nums.length / 3) {
            result.add(candidate1);
        } else if (count2 > nums.length / 3) {
            result.add(candidate2);
        }
        System.out.println(result);
    }

}
