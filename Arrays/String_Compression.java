package Arrays;

import java.util.Arrays;

public class String_Compression {
    public static void main(String[] args) {
        char[] comp = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        int i = 0;
        int j = 0;
        while (i < comp.length) {
            char current = comp[i];
            int count = 0;

            while (i < comp.length && comp[i] == current) {
                i++;
                count++;
            }
            comp[j] = current;
            j++;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    comp[j] = c;
                    j++;
                }
            }

        }
        System.out.println(j);

    }

}
