package Arrays;

public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "racecar";
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(right)) {
                    System.out.println("False");
                }
                left++;
                right--;
            }
        }
        System.out.println("True");
    }

}
