package Sliding_Window;

public class Max_Pointobtfromcard {
    public static void main(String[] args) {
        int[] cardpoint = { 6, 2, 3, 4, 7, 2, 1, 7, 1 };
        int k = 4;
        int leftsum = 0;
        int rightsum = 0;
        int maxsum = 0;
        int right = cardpoint.length - 1;
        for (int i = 0; i < k; i++) {
            leftsum += cardpoint[i];
        }
        maxsum = leftsum;
        for (int j = k - 1; j >= 0; j--) {
            leftsum -= cardpoint[j];
            rightsum += cardpoint[right];
            right--;
            maxsum = Math.max(maxsum, leftsum + rightsum);
        }
        System.out.println(maxsum);
    }

}
