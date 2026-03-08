package Sliding_Window;

public class MinSubarraysum {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int target = 7;

        int currentsum = 0;
        int minwindow = Integer.MAX_VALUE;
        int low = 0;
        int high = 0;
        while (high < nums.length) {
            currentsum += nums[high];
            high++;
            while (currentsum >= target) {
                int currentwindow = high - low;
                minwindow = Math.min(minwindow, currentwindow);
                currentsum -= nums[low];
                low++;
            }
        }
        System.out.println(minwindow == Integer.MAX_VALUE ? 0 : minwindow);
    }
}
