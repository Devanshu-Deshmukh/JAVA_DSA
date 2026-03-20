package Prefix_Sum;

public class Pivot_Index {
    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int totalsum = 0;
        int leftsum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalsum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int rightsum = totalsum - leftsum - nums[i];

            if (leftsum == rightsum) {
                System.out.println(i);
            }
            leftsum += nums[i];
        }
        System.out.println("");
    }

}
