class Maximum_Number {
    public static void main(String[] args) {
        int[] nums = { 3, 3, 6, 1 };
        int max = nums[0];
        if (nums.length == 0) {
            System.out.println("Array is empty");
        }
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println("Maximum number in the array is: " + max);
    }
}
