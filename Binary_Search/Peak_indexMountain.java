package Binary_Search;

public class Peak_indexMountain {
    public static void main(String[] args) {
        int[] arr = { 0, 5, 10, 2 };
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.println(left);
    }
}
