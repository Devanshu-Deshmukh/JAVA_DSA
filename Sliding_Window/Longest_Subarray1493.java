package Sliding_Window;

public class Longest_Subarray1493 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
        int left = 0;
        int maxlen = 0;
        int zerocount = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zerocount++;
            }
            while (zerocount > 1) {
                if (nums[left] == 0) {
                    zerocount--;
                }
                left++;
            }
            maxlen = Math.max(maxlen, right - left);
        }
        System.out.println(maxlen);
    }
}
