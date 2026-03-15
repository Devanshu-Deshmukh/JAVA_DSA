package Sliding_Window;

public class Equal_SubunderBud {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "bcdf";
        int maxcost = 3;
        int left = 0;
        int currentcost = 0;
        int maxlength = 0;
        for (int right = 0; right < s.length(); right++) {
            currentcost += Math.abs(s.charAt(right) - t.charAt(right));
            while (currentcost > maxcost) {
                currentcost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            maxlength = Math.max(maxlength, right - left + 1);
        }
        System.out.println(maxlength);
    }

}
