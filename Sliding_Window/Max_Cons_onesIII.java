package Sliding_Window;

public class Max_Cons_onesIII {
    public static void main(String[] args) {
        int[] numsmax = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        int left = 0;
        int maxlen = 0;
        int zerocount = 0;
        for (int right = 0; right < numsmax.length; right++) {
            if (numsmax[right] == 0)
                zerocount++;
            while (zerocount > k) {
                if (numsmax[left] == 0) {
                    zerocount--;
                }
            }
            maxlen = Math.max(maxlen, right - left + 1);

        }
        System.out.println(maxlen);
    }

}
