package Arrays;

public class Sorted_Array {

    static boolean solution(int[] arr, int n) {

        for (int i = 1; i < n; i++) {

            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 4, 3, 5 };
        int n = nums.length;

        boolean result = solution(nums, n);

        System.out.println(result);
    }
}
