package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Largest_Conse_Seq {
    public static void main(String[] args) {
        int[] nums = { 102, 100, 4, 101, 1, 3, 2, 1, 1 };
        if (nums.length == 0) {
            System.out.println("The the array is Empty");
        }
        int longest = 1;
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            st.add(nums[i]);
        }
        for (int it : st) {
            if (!st.contains(it - 1)) {
                int count = 1;
                int x = it;
                while (st.contains(x + 1)) {
                    x = x + 1;
                    count = count + 1;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.println("The Longest Consecutive Sequence is: " + longest);
    }
}
