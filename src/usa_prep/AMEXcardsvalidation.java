package usa_prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AMEXcardsvalidation {
    public static void main(String[] args){
        String card = "3333-2222-3033-2711";
        List<String> cards = new ArrayList<>(Arrays.asList("1111", "2222", "3333"));
        String exDate = "27/11";
        if(checkCardStream(cards, card, exDate)) {
            System.out.println("Card is good!");
        } else System.out.println("Card is not valid!");
    }

    public static boolean checkCard(List<String> cards, String card, String exDate) {
        for(String s : cards) {
            if(s.equals(card.substring(0, 4)) &&
                    exDate.replace("/", "").equals(card.substring(15, 19)))
                return true;
        }
        return false;
    }

    public static boolean checkCardStream(List<String> cards, String card, String exDate) {
        return cards.stream().anyMatch(s -> s.equals(card.substring(0, 4)) &&
                        exDate.replace("/", "").equals(card.substring(card.length()-4)));
    }
}