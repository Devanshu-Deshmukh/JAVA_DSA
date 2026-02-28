package Arrays;

public class Duplicateno {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        // Floyd's Algorithm
        // ismai slow 1 step at a time chalega
        // aur fast pointer 2 step chalega
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        // cycle check kar li hai opper abh slow ko strating pe rakhenge aur dono slow
        // aur fast ko 1step chalyenge
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        System.out.println(slow);

    }
}
