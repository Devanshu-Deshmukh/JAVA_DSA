package Sliding_Window;

import java.util.HashMap;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };
        int left = 0;
        int maxfruit = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int right = 0; right < arr.length; right++) {
            int currentfruit = arr[right];
            mpp.put(currentfruit, mpp.getOrDefault(currentfruit, 0) + 1);
            while (mpp.size() > 2) {
                int leftfruit = arr[left];
                mpp.put(leftfruit, mpp.get(leftfruit) - 1);
                if (mpp.get(leftfruit) == 0) {
                    mpp.remove(leftfruit);
                }
                left++;
            }
            maxfruit = Math.max(maxfruit, right - left + 1);
        }
        System.out.println(maxfruit);
    }

}
