package Binary_Search;

public class Find_Smallest_greater {
    public static void main(String[] args) {

        char[] letters = { 'c', 'f', 'j' };
        char target = 'a';
        int left = 0;
        int right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (left == letters.length) {
            System.out.println(letters[0]);
        } else {
            System.out.println(letters[left]);
        }
    }

}
