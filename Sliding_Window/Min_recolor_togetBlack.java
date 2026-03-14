package Sliding_Window;

public class Min_recolor_togetBlack {
    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        int count = 0;
        int minopr = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                count++;
            }
        }
        minopr = count;
        for (int right = k; right < blocks.length(); right++) {
            if (blocks.charAt(right) == 'W') {
                count++;
            }
            if (blocks.charAt(right - k) == 'W') {
                count--;
            }
            minopr = Math.min(minopr, count);
        }
        System.out.println(minopr);
    }

}
