import java.util.Arrays;

class ReverseString {
    public static void reverseString(char[] s) {
        char[] result = new char[s.length];
        for (int i=0; i<s.length; i++) {
            result[s.length-1 - i] = s[i];
        }
        for(char c: result) {
            System.out.println(c);
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        char[] array = new char[]{'h','i',' ','t','h','e','r','e'};
        reverseString(array);
    }
}
