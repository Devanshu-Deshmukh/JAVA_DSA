package Intervals;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Divide_MinGroup {
    public static void main(String[] args) {
        int[][] intervals = { { 5, 10 }, { 6, 8 }, { 1, 5 }, { 2, 3 }, { 1, 10 } };
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int[] it : intervals) {
            int currentstart = it[0];
            int currentend = it[1];
            if (!pq.isEmpty() && pq.peek() < currentstart) {
                pq.poll();
            }
            pq.offer(currentend);
        }
        System.out.println(pq.size());
    }
}
