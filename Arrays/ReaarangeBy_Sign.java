package Arrays;

import java.util.Arrays;

public class ReaarangeBy_Sign {
    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        int positiveidx = 0;
        int negativeidx = 1;
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                arr[negativeidx] = nums[i];
                negativeidx += 2;
            } else {
                arr[positiveidx] = nums[i];
                positiveidx += 2;
            }
        }
        int[] result = arr;
        System.out.println("The Rearranged array is :" + Arrays.toString(result));
    }

}
