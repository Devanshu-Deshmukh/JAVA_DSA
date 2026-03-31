package Intervals;

import java.util.Arrays;

public class Non_Overlapping {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 11 }, { 2, 12 }, { 11, 22 }, { 1, 100 } };
        Arrays.sort(intervals, (a, b) -> {
            return a[1] - b[1];
        });
        int last = intervals[0][1];
        int count = 0;
        int n = intervals.length;
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] < last) {
                count++;
            } else {
                last = intervals[i][1];
            }
        }
        System.out.println(count);
    }

}
