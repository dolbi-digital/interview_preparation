package usa_prep.streamgroupby;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    final String name;
    final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    public int getAge() {
        return age;
    }

    enum AgeGroup {
        YOUNG, ADULT, OLD
    }
    static Map<AgeGroup, List<Person>> groupByAge(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(person -> {
            if (person.getAge() >= 14 && person.getAge() < 18) {
                return AgeGroup.YOUNG;
            } else if (person.getAge() >= 18 && person.getAge() < 60) {
                return AgeGroup.ADULT;
            } else {
                return AgeGroup.OLD;
            }
        }));
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Jim", 25),
                new Person("Dale", 17),
                new Person("Jane", 66),
                new Person("Ann", 33)
        ));

        Map<AgeGroup, List<Person>> map = groupByAge(people);
        for (Map.Entry<AgeGroup, List<Person>> entry : map.entrySet()) {
            AgeGroup ageGroup = entry.getKey();
            List<Person> persons = entry.getValue();

            System.out.println(ageGroup + ":");
            for (Person person : persons) {
                System.out.println("  " + person.getName() + " " + person.getAge());
            }
        }

        map.forEach((ageGroup, persons) -> {
            System.out.println(ageGroup + ":");
            persons.forEach(person -> System.out.println("  " + person));
        });
    }
}

