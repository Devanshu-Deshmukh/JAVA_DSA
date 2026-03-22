package Prefix_Sum;

public class Spliting_array {
    public static void main(String[] args) {
        int[] nums = { 10, 4, -8, 7 };
        long leftsum = 0;
        long rightsum = 0;
        long totalsum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            totalsum += nums[i];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            leftsum += nums[i];
            rightsum = totalsum - leftsum;
            if (leftsum >= rightsum) {
                count++;
            }
        }
        System.out.println(count);
    }

}
