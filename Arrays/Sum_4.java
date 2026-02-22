package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Sum_4 {
    public static void main(String[] args) {
        int[] nums = { -2, -1, 0, 0, 1, 2 };
        int target = 0;
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > 0 && nums[j] == nums[j - 1])
                    continue;
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    long sum = nums[i] + nums[j];
                    sum += nums[left];
                    sum += nums[right];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;

                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }

        }
        System.out.println(result);
    }

}
