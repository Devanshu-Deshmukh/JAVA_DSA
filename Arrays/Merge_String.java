package Arrays;

public class Merge_String {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                result.append(word2.charAt(j));
                j++;
            }
        }
        System.out.println(result.toString());
    }

}
