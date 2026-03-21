package Prefix_Sum;

public class Spliting_String {
    public static void main(String[] args) {
        String s = "010111";
        int leftzero = 0;
        int rightone = 0;
        int maxscore = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                rightone++;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftzero++;
            } else {
                rightone--;
            }
            int currentsum = leftzero + rightone;
            maxscore = Math.max(maxscore, currentsum);
        }
        System.out.println(maxscore);
    }

}
