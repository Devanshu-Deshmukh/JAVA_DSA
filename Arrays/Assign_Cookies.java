package Arrays;

import java.util.Arrays;

public class Assign_Cookies {
    public static void main(String[] args) {
        int[] g = { 1, 2, 3 }; // ye bache kie greed hai
        int[] s = { 1, 1 }; // ye cookie ka size hai
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;
        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) {
                child++;
            }
            cookie++;
        }
        System.out.println(child);

    }

}
