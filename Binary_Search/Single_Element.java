package Binary_Search;

public class Single_Element {
    public static void main(String[] args) {
        int[] nums = { 3, 3, 7, 7, 10, 11, 11 };
        int n = nums.length;

        if (n == 1)
            System.out.println(nums[0]);
        if (nums[0] != nums[1])
            System.out.println(nums[0]);
        if (nums[n - 1] != nums[n - 2])
            System.out.println(nums[n - 1]);

        int left = 1;
        int right = n - 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                System.out.println(nums[mid]);
            }
            if (nums[mid] == nums[mid ^ 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

    }
}
