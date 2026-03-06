package Sliding_Window;

public class Subarr_avg_gtrthanthreshold {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 2, 5, 5, 5, 8 };
        int k = 3;
        int threshold = 4;
        int count = 0;
        int currentsum = 0;
        int target = threshold * k;
        for (int i = 0; i < k; i++) {
            currentsum += arr[i];
        }
        if (currentsum >= target) {
            count++;
        }
        for (int i = k; i < arr.length; i++) {
            currentsum += arr[i];
            currentsum -= arr[i - k];
            if (currentsum >= target) {
                count++;
            }
        }
        System.out.println(count);
    }

}
