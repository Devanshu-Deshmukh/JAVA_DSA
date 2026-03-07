package Sliding_Window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        int[] scount = new int[26];
        int[] pcount = new int[26];
        List<Integer> result = new ArrayList<>();
        int k = p.length();

        if (s.length() < p.length()) {
            System.out.println(result);
        }
        for (int i = 0; i < k; i++) {
            pcount[p.charAt(i) - 'a']++; // 'a'-'a'=0, 'b'-'a'=1 (Index nikalne ki trick)
            scount[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pcount, scount)) {
            result.add(0);
        }

        for (int i = k; i < s.length(); i++) {
            scount[s.charAt(i) - 'a']++;
            scount[s.charAt(i - k) - 'a']--;
            if (Arrays.equals(pcount, scount)) {
                result.add(i - k + 1); // i - windowSize + 1 humein window ka starting index deta hai
            }
        }

        System.out.println(result);
    }
}
