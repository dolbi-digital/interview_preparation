package usa_prep;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReversePhrase {
    public static void main(String[] args) {
        String string = "The quick brown fox jumped over the lazy dog.";
        reverse(string);
        System.out.println(reverseStream(string));
        reverseWords(string);
        System.out.println(reverseWordsStream(string));
    }

    public static void reverse(String string) {
        String[] array = string.split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<array.length; i++) {
            char[] chars = array[i].toCharArray();
            for(int j=0; j<chars.length; j++) {
                builder.append(chars[chars.length - 1 - j]);
            }
            if(i==array.length - 1) break;
            builder.append(" ");
        }
        System.out.println(builder);
    }

    public static void reverseWords(String string) {
        String[] array = string.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i=0; i<array.length; i++) {
            result.append(array[array.length - 1 - i]);
            if(!(i==array.length-1))
                result.append(" ");
        }
        System.out.println(result);
    }

    public static String reverseStream(String string) {
        return Arrays.stream(string.split(" ")).
                map(s -> new StringBuilder(s).reverse().toString()).
                collect(Collectors.joining(" "));
    }

    public static String reverseWordsStream(String string) {
        return Arrays.stream(string.split(" ")).
                reduce((word1, word2) -> word2 + " " + word1).
                orElse("");
    }
}
