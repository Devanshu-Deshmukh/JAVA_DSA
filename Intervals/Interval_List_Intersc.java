package Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interval_List_Intersc {
    public static void main(String[] args) {
        int[][] arr = answer();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + Arrays.toString(arr[i]));
        }
    }

    public static int[][] answer() {
        int[][] firstlist = { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } };
        int[][] secondlist = { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } };
        int i = 0;
        int j = 0;
        List<int[]> result = new ArrayList<>();
        while (i < firstlist.length && j < secondlist.length) {
            int startmax = Math.max(firstlist[i][0], secondlist[j][0]);
            int endmin = Math.min(firstlist[i][1], secondlist[j][1]);
            if (startmax <= endmin) {
                result.add(new int[] { startmax, endmin });
            }
            if (firstlist[i][1] < secondlist[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }

}
