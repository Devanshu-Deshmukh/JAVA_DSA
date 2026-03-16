package Sliding_Window;

public class Confusion_Exam {
    public static void main(String[] args) {
        String answerKey = "TFFT";
        int k = 1;
        int left = 0;
        int tcount = 0;
        int fcount = 0;
        int maxleng = 0;
        for (int right = 0; right < answerKey.length(); right++) {
            if (answerKey.charAt(right) == 'T') {
                tcount++;
            } else {
                fcount++;
                ;
            }
            int window = right - left + 1;
            int maxchar = Math.max(tcount, fcount);
            while (window - maxchar > k) {
                if (answerKey.charAt(left) == 'T') {
                    tcount--;
                } else {
                    fcount--;
                }
                left++;
                window = right - left + 1;
                maxchar = Math.max(tcount, fcount);
            }
            maxleng = Math.max(maxleng, right - left + 1);
        }
        System.out.println(maxleng);

    }

}
