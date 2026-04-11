package Intervals;

import java.util.ArrayList;
import java.util.List;

public class partition_Label {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);

            if (i == end) {
                result.add(i - start + 1);
                start = i + 1;
            }
        }
        System.out.println(result);
    }

}
