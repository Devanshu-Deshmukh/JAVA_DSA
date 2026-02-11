package Arrays;

public class Remove_Duplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 2, 2, 4, 4, 6, 7 };
        if (nums.length == 0) {
            System.out.println("Empty array");
        }
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        System.out.println(j + 1);

    }
}
