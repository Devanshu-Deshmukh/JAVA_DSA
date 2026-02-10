package Arrays;

public class Second_Largest {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 3, 8 };
        int largest = Integer.MIN_VALUE;
        int Second_Largest = Integer.MIN_VALUE;
        if (nums.length < 2) {
            return;
        }
        if (nums.length == 0) {
            System.out.println("Empty Array");
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                Second_Largest = largest;
                largest = nums[i];
            } else if (nums[i] > Second_Largest && nums[i] != largest) {
                Second_Largest = nums[i];
            }
        }
        System.out.println("Second Largest is: " + Second_Largest);

    }

}
