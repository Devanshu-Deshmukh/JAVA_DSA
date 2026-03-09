package Sliding_Window;

import java.util.HashSet;
import java.util.Set;

public class SubStrWithoutRepChar {
    public static void main(String[] args) {
        String s = "abcabcabb";
        int left = 0;
        int maxLength = 0;

        // Window ke andar current characters ko yaad rakhne ke liye
        Set<Character> windowSet = new HashSet<>();

        // 'right' pointer window ko aage badhayega
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // Agar character pehle se set mein hai, toh left se shrink karo
            while (windowSet.contains(currentChar)) {
                windowSet.remove(s.charAt(left));
                left++;
            }

            // Naye character ko set (window) mein daalo
            windowSet.add(currentChar);

            // Max length update karo
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }
}