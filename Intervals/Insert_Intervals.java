package Intervals;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Insert_Intervals {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
        int[] newintervals = { 4, 8 };

        List<int[]> result = new ArrayList<>();
        int n = intervals.length;
        int i = 0;
        while (i < n && intervals[i][1] < newintervals[0]) {
            result.add(intervals[i]);
            i++;
        }
        while (i < n && intervals[i][0] <= newintervals[1]) {
            newintervals[0] = Math.min(newintervals[0], intervals[i][0]);
            newintervals[1] = Math.max(newintervals[1], intervals[i][1]);
            i++;
        }
        result.add(newintervals);
        while (i < n) {
            result.add(intervals[i]);
        }

        System.out.println(result.toArray(new int[result.size()][]));
    }
}
