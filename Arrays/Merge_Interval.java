package Arrays;

import java.util.*;

public class Merge_Interval {
    public static void main(String[] args) {
        int[][] nums = {
                { 1, 3 },
                { 8, 10 },
                { 2, 6 },
                { 15, 18 },
        };
        Arrays.sort(nums, (a, b) -> a[0] - b[0]);
        int start = nums[0][0];
        int end = nums[0][1];
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            int s = nums[i][0];
            int e = nums[i][1];
            if (s <= end) {
                end = Math.max(e, end);

            } else {
                list.add(new int[] { start, end });
                start = s;
                end = e;
            }
        }
        list.add(new int[] { start, end });
        System.out.println(list.toArray(new int[list.size()][]));

    }

}
