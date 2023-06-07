package stream.groupby;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSortComparator {
    public static void main(String[] args) {

        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Nokia 9", "HMD Global",150),
                new Phone("Galaxy S9", "Samsung", 300));

        phoneStream.sorted(Comparator.comparing(o -> o.getName().toUpperCase()))

                //(o1, o2) -> o1.getName().toUpperCase().
                //compareTo(o2.getName().toUpperCase())

                //sorted(new PhoneComparator())

                .forEach(p->System.out.printf("%s (%s) - %d \n",
                        p.getName(), p.getCompany(), p.getPrice()));
    }
}

class PhoneComparator implements Comparator<Phone> {
    public int compare(Phone a, Phone b){
        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}

