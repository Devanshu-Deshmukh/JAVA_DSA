package Arrays;

public class First_Palindrome {
    public static void main(String[] args) {
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word);
                break;
            }
        }
        System.out.println("");

    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
