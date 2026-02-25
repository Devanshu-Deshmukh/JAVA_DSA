package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class Intersection2Arr {
    public static void main(String[] args) {
        int[] numss1 = { 1, 2, 2, 1 };
        int[] numss2 = { 2, 2 };
        HashSet<Integer> set = new HashSet<>();
        for (int num : numss1) {
            set.add(num);

        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : numss2) {
            if (set.contains(num)) {
                list.add(num);
                set.remove(num);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        System.out.println(Arrays.toString(result));
    }

}
