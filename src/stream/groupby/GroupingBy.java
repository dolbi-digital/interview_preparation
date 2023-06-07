package stream.groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy {

    public static void main(String[] args) {

        Stream<Phone> phoneStream = Stream.of(
                new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Galaxy S9", "Samsung", 440),
                new Phone("Galaxy S8", "Samsung", 340));

        Map<String, List<Phone>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(Phone::getCompany));

        for(Map.Entry<String, List<Phone>> item : phonesByCompany.entrySet()){
            System.out.println(item.getKey());
            for(Phone phone : item.getValue()){
                System.out.println(phone.getName());
            }
            System.out.println();
        }
    }
}
