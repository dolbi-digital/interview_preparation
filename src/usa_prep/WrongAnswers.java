package usa_prep;

import java.util.Arrays;

public class WrongAnswers {
    public static void main(String[] args) {
        System.out.println(getWrongAnswers(10, "ABBBBBBBAAAA"));
    }
    public static String getWrongAnswers(int N, String C) {
        StringBuilder sb = new StringBuilder();
        for(char c : C.toCharArray()) {
            if(c=='A')
                sb.append('B');
            else
                sb.append('A');
        }
        return sb.toString();
    }

}