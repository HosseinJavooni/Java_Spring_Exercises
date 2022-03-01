package methodReference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainMethodReference {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        Collections.addAll(personList,
                new Person("Hossein", "javooni", 37),
                new Person("Mahnoosh", "Motamed", 35),
                new Person("Mahan", "Javooni", 1));

        personList.stream().map(Person::getFirstName).map(String::toUpperCase).map(String::toLowerCase).forEach(System.out::println);

    }


}
