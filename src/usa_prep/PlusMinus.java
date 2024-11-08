package usa_prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 4, 0, 0, -2));
        plusMinus(list);
    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positive=0;
        int negative=0;
        int zero=0;
        for(Integer i : arr) {
            if(i>0) positive+=1;
            else if(i<0) negative+=1;
            else zero+=1;
        }
        float sum = positive + negative + zero;
        System.out.println(positive/sum);
        System.out.println(negative/sum);
        System.out.println(zero/sum);
    }

}
