package usa_prep;

public class HackerrankString {
    public static void main(String[] args) {
        System.out.println(hackerrankInString("haccccckerrrrrannnk"));
    }

    public static String hackerrankInString(String s) {
        String hackerrank = "hackerrank";
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (j < hackerrank.length() && s.charAt(i) == hackerrank.charAt(j)) {
                j++;
            }
        }

        return j == hackerrank.length() ? "YES" : "NO";
    }
}
