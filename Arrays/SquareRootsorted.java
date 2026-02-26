package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SquareRootsorted {
    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 4, 7, 3 };
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] * nums[i];
            list.add(sum);
        }
        Collections.sort(list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        System.out.println(Arrays.toString(result));
    }

}
