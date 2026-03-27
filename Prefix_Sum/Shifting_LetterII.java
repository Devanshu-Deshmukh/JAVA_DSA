package Prefix_Sum;

public class Shifting_LetterII {
    public static void main(String[] args) {
        String s = "abc";
        int[][] shifts = { { 0, 1, 0 }, { 1, 2, 1 }, { 0, 2, 1 } };

        int n = s.length();
        int[] diff = new int[n + 1];
        for (int i = 0; i < shifts.length; i++) {
            int start = shifts[i][0];
            int end = shifts[i][1];
            int direction = shifts[i][2];
            int val = (direction == 1) ? 1 : -1;
            diff[start] += val;
            diff[end] += val;
            diff[end + 1] -= val;
        }
        int currentshift = 0;
        char[] resultarray = s.toCharArray();
        for (int i = 0; i < n; i++) {
            currentshift += diff[i];
            int netshift = (currentshift % 26 + 26) % 26;
            int original = resultarray[i] - 'a';
            int newchar = (original + netshift) % 26;
            resultarray[i] = (char) ('a' + newchar);
        }
        System.out.println(resultarray);
    }

}
