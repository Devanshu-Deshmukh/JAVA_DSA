package Intervals;

import java.util.TreeMap;

public class MyCalendar_I {
    public static void main(String[] args) {
        boolean result = calendar();
        System.out.println(result);
    }

    public static boolean calendar() {
        int[][] bookings = { {}, { 10, 20 }, { 15, 25 }, { 20, 30 } };
        TreeMap<Integer, Integer> calender = new TreeMap<>();
        int start = bookings[1][0];
        int end = bookings[1][1];
        calender.put(start, end);
        Integer prevstart = calender.floorKey(start);
        Integer nextstart = calender.ceilingKey(start);
        if (prevstart != null && calender.get(prevstart) > start) {
            return false;
        }
        if (nextstart != null && nextstart < end) {
            return false;
        }
        calender.put(start, end);
        return true;
    }

}
