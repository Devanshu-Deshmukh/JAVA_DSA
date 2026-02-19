package Arrays;

import java.util.HashMap;

public class Subarray_SumK {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 4 };
        int k = 6;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(map, 0) + 1);
        }
        System.out.println("The Number of Count is : " + count);
    }
}
