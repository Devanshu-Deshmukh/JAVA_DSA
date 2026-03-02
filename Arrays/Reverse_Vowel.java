package Arrays;

public class Reverse_Vowel {
    public static void main(String[] args) {
        String s = "IceCream";
        char[] word = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        String vowel = "aeiouAEIOU";
        while (left < right) {
            while (left < right && vowel.indexOf(word[left]) == -1) {
                left++;

            }
            while (left < right && vowel.indexOf(word[right]) == -1) {
                right--;
            }
            char temp = word[left];
            word[left] = word[right];
            word[right] = temp;

            left++;
            right--;
        }
        System.out.println(word);
    }

}
