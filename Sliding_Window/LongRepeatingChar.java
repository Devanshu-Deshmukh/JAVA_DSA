package Sliding_Window;

public class LongRepeatingChar {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int[] count = new int[26];
        int left = 0;
        int maxfreq = 0;
        int maxleng = 0;
        for (int right = 0; right < s.length(); right++) {
            char rightchar = s.charAt(right);
            count[rightchar - 'A']++;
            maxfreq = Math.max(maxfreq, count[rightchar - 'A']);
            int window = right - left + 1;
            if (window - maxfreq > k) {
                char leftchar = s.charAt(left);
                count[leftchar - 'A']--;
                left++;
            }
            maxleng = Math.max(maxleng, right - left + 1);
        }
        System.out.println(maxleng);
    }

}
