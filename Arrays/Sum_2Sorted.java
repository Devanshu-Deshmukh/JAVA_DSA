package Arrays;

public class Sum_2Sorted {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7 };
        int target = 6;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                System.out.println((left + 1) + " " + (right + 1));
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("-1 -1");
    }
}
