import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("abcd"));
        System.out.println(reverseString2("Hello world!!"));
        System.out.println(reverseString3("Hello world!!"));
        System.out.println(reverseString4("Hello world!!"));
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static String reverseString2(String str){
        char[] ch = str.toCharArray();
        StringBuilder rev = new StringBuilder();
        for (int i=ch.length-1; i>=0; i--) {
            rev.append(ch[i]);
        }
        return rev.toString();
    }

    public static String reverseString3(String str){
        char[] ch = str.toCharArray();
        char[] reverse = new char[ch.length];
        for (int i=0; i<ch.length; i++) {
            reverse[ch.length - 1 - i] = ch[i];
        }
        return Arrays.toString(reverse);
    }

    public static String reverseString4(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.insert(0, str.charAt(i));
            //result = str.charAt(i) + result;
        }
        return result.toString();
    }
}