package Arrays;

public class Left_Rotate {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 3, 6, 5, 8 };
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;

        for (int i : nums) {
            System.out.println("The Left rotated array is: " + i);
        }
    }

}
