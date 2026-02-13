package Arrays;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 1, 2, 3, 2, 3 };

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int first = nums[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == first) {
                    count++;

                }

            }
            if (count == 1)
                System.out.println("The Single ones is " + first);
        }

    }

}
