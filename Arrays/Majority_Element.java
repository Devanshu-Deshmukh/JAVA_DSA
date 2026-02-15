package Arrays;

public class Majority_Element {
    public static void main(String[] args) {
        // Boyer Moore Voting Algo
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int candidate = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];

            }
            if (nums[i] == candidate) {
                count++;

            } else {
                count--;
            }
        }

        System.out.println("The Maximum number :" + candidate);
    }

}
