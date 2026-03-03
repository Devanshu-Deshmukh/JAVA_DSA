package Arrays;

import java.util.Arrays;

public class Boat_ToSave {
    public static void main(String[] args) {
        int[] people = { 3, 2, 2, 1 };
        int limit = 3;
        int boat = peopleonboat(people, limit);
        System.out.println(boat);
    }

    public static int peopleonboat(int[] arr, int max) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int maxboat = 0;
        while (left <= right) {
            if (arr[left] + arr[right] <= max) {
                left++;
                right--;
            } else {
                right--;
            }
            maxboat++;
        }
        return maxboat;
    }

}
