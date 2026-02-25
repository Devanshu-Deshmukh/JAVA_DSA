package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Intersection2ArrII {
    public static void main(String[] args) {
        int[] numsss1 = { 1, 2, 2, 1 };
        int[] numsss2 = { 2, 2 };
        HashMap<Integer, Integer> mapp = new HashMap<>();
        for (int num : numsss1) {
            mapp.put(num, mapp.getOrDefault(num, 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        for (int num : numsss2) {
            if (mapp.containsKey(num) && mapp.get(num) > 0) {
                res.add(num);
                mapp.put(num, mapp.get(num) - 1);
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        System.out.println(Arrays.toString(result));
    }

}
