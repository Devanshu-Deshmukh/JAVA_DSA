package Prefix_Sum;

public class Car_poolings {
    public static void main(String[] args) {
        int[][] trips = { { 2, 1, 5 }, { 3, 3, 7 } };
        int capacity = 4;
        int[] stop = new int[1001];
        for (int i = 0; i < trips.length; i++) {
            int passenger = trips[i][0];
            int from = trips[i][1];
            int to = trips[i][2];

            stop[from] += passenger;
            stop[to] -= passenger;
        }
        int current = 0;
        for (int i = 0; i < 1001; i++) {
            current += stop[i];
            if (current > capacity) {
                System.out.println("false");
            }

        }
        System.out.println("true");
    }
}
