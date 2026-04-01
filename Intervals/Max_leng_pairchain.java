package Intervals;

import java.util.Arrays;

public class Max_leng_pairchain {
    public static void main(String[] args) {
        int[][] pairs = { { 1, 2 }, { 2, 3 }, { 3, 4 } };
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        int currentlast = pairs[0][1];
        int count = 1;
        int n = pairs.length;
        for (int i = 1; i < n; i++) {
            if (pairs[i][0] > currentlast) {
                count++;
                currentlast = pairs[i][1];
            }
        }
        System.out.println(count);
    }

}
