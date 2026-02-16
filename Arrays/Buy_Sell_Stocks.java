package Arrays;

public class Buy_Sell_Stocks {
    public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 3, 6, 4 };
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minprice) {
                minprice = nums[i];

            } else if (nums[i] - minprice > maxprofit) {
                maxprofit = nums[i] - minprice;
            }
        }
        System.out.println("The Maximum Profit is: " + maxprofit);
    }

}
