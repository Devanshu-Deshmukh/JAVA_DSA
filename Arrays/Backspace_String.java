package Arrays;

public class Backspace_String {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        Backspace_String obj = new Backspace_String();
        boolean result = obj.backspaceCompare(s, t);
        System.out.println(result);
    }

    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

}
