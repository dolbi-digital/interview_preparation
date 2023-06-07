import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListIntoMap {

    //WebElement rateRend = driver.findElement(By.xpath("//td/a[contains(text(),'Ренд')]/parent::td/following-sibling::td"));
    String rate_byname = "//td/a[contains(text(),’%s’)]/parent::td/following-sibling::td";
    static String rateByCode = "//td[contains(text(),'%s')]//following-sibling::td[last()] %d";

    private static List<Integer> rates = new ArrayList<>(List.of(38, 42, 1));
    private static List<String> codes = Stream.of("USD", "EUR", "UAH").collect(Collectors.toList());
    private static List<String> test = new ArrayList<>(Arrays.asList("1", "2"));


    public static void main(String[] args) {
        System.out.println(getRate("USD"));
        codes.add("XXX");
        rates.add(5);
        System.out.println(getTable());
        System.out.println(getTableStream());
    }


     public static String getRate(String code) {
         return String.format(rateByCode, code, 18);
     }

     public static Map<String, String> getTable() {
         Map<String, String> map = new HashMap<>();
         int n;

         if(codes.size()==rates.size()) {
             n=codes.size();
         } else throw new UnknownError();

         for(int i=0; i<n; i++) {
             map.put(codes.get(i), String.valueOf(rates.get(i)));
         }
         return map;
     }

    public static Map<String, Integer> getTableStream() {
        //Map<Integer, String> map = rates.stream().collect(Collectors.toMap(rates::get, codes::get));
        Map<String, Integer> map2 = codes.stream().collect(Collectors.toMap(key -> key,
                key -> rates.get(codes.indexOf(key))));

        return map2;
    }
}
