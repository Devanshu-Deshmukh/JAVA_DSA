package Sliding_Window;

public class MaxnoVowel {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        int currentsum = 0;
        int maxsum = 0;
        for (int i = 0; i < k; i++) {
            if (isvowel(s.charAt(i))) {
                currentsum++;
            }
        }
        maxsum = currentsum;
        for (int i = k; i < s.length(); i++) {
            if (isvowel(s.charAt(i - k))) {
                currentsum--;
            }
            if (isvowel(s.charAt(i))) {
                currentsum++;
            }
            maxsum = Math.max(maxsum, currentsum);
        }
        System.out.println(maxsum);
    }

    private static boolean isvowel(char c) {
        return c == 'a' || c == 'i' || c == 'o' || c == 'u' || c == 'e';
    }

}
