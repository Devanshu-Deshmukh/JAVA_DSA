package Prefix_Sum;

import java.util.Arrays;
import java.util.HashMap;

public class Flights_booking {
    public static void main(String[] args) {
        int[][] bookings = { { 1, 2, 10 }, { 2, 3, 20 }, { 2, 5, 25 } };
        int n = 5;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < bookings.length; i++) {
            int first = bookings[i][0];
            int last = bookings[i][1];
            int seats = bookings[i][2];

            map.put(first, map.getOrDefault(first, 0) + seats);
            map.put(last + 1, map.getOrDefault(last + 1, 0) - seats);
        }
        int[] result = new int[n];
        int currentseat = 0;
        for (int i = 1; i <= n; i++) {
            currentseat += map.getOrDefault(i, 0);
            result[i - 1] = currentseat;
        }
        System.out.println(Arrays.toString(result));
    }

}
