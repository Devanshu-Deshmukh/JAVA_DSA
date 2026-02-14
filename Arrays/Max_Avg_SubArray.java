package Arrays;

public class Max_Avg_SubArray {
    public static void main(String[] args) {
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxsum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            maxsum = Math.max(maxsum, sum);
        }
        double result = maxsum / k;
        System.out.println("The Maximum Average Sum is :" + result);
    }

}
