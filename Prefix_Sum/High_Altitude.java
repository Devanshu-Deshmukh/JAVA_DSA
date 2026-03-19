package Prefix_Sum;

public class High_Altitude {
    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        int currentaltitude = 0;
        int maxaltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currentaltitude += gain[i];
            maxaltitude = Math.max(maxaltitude, currentaltitude);

        }
        System.out.println(maxaltitude);
    }

}
