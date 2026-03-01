package Arrays;

import java.util.Arrays;

public class SortByParityII {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 2, 7, 8, 5 };
        int evenptr = 0;
        int oddptr = 1;
        int n = nums.length;
        while (evenptr < n && oddptr < n) {
            while (evenptr < n && nums[evenptr] % 2 == 0) {
                evenptr += 2;

            }
            while (oddptr < n && nums[oddptr] % 2 != 0) {
                oddptr += 2;
            }
            if (evenptr < n && oddptr < n) {
                int temp = nums[evenptr];
                nums[evenptr] = nums[oddptr];
                nums[oddptr] = temp;

                evenptr += 2;
                oddptr += 2;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
