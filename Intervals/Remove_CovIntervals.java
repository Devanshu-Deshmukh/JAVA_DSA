package Intervals;

import java.util.Arrays;

public class Remove_CovIntervals {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 4 }, { 3, 6 }, { 2, 8 } };
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            } else {
                return a[0] - b[0];
            }
        });
        int valid = 0;
        int max = -1;
        for (int i = 0; i < intervals.length; i++) {
            int current = intervals[i][1];
            if (current > max) {
                valid++;
                max = current;
            }
        }
        System.out.println(valid);
    }

}
