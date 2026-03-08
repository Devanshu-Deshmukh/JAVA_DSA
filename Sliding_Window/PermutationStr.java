package Sliding_Window;

import java.util.Arrays;

public class PermutationStr {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eiabaooo";
        boolean result = Permutation(s1, s2);
        System.out.println(result);

    }

    public static boolean Permutation(String s1, String s2) {
        int[] s1count = new int[26];
        int[] s2count = new int[26];
        int k = s1.length();
        for (int i = 0; i < k; i++) {
            s1count[s1.charAt(i) - 'a']++;
            s2count[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(s1count, s2count)) {
            return true;
        }
        for (int i = k; i < s2.length(); i++) {
            s2count[s2.charAt(i) - 'a']++;
            s2count[s2.charAt(i - k) - 'a']--;
            if (Arrays.equals(s1count, s2count)) {
                return true;
            }
        }
        return false;
    }

}
