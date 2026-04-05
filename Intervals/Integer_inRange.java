package Intervals;

import java.util.Arrays;

public class Integer_inRange {
    public static void main(String[] args) {
        boolean range = isRange();
        System.out.println(range);
    }

    public static boolean isRange() {
        int[][] ranges = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int left = 2;
        int right = 5;
        Arrays.sort(ranges, (a, b) -> Integer.compare(a[0], b[0]));
        for (int[] range : ranges) {
            int currentstart = range[0];
            int currentend = range[1];
            if (currentstart <= left && currentend >= left) {
                left = currentend + 1;

            }
            if (left > right) {
                return true;
            }
        }
        return left > right;
    }

}
