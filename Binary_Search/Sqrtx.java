package Binary_Search;

public class Sqrtx {
    public static void main(String[] args) {
        int x = 8;
        int left = 0;
        int right = x;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;
            if (square == x) {
                System.out.println(mid);
            } else if (square < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
