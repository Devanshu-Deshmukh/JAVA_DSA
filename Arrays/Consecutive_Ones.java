package Arrays;

public class Consecutive_Ones {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;

            } else {
                count = 0;
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println("The Number of consecutive ones is :" + max);
    }

}
