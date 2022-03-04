package Optional;

import java.util.*;
import java.util.stream.Stream;

public class OptionalMain {
    public static void main(String[] args) {
        Person person;
        person = new Person("Hossein", "Javooni", 37,"h.javooni@gmail",
                new Person.NationalCode("123456", System.currentTimeMillis()));
//        System.out.println(Optional.ofNullable(Person));
        person.setFirstName(null);
//        if(Optional.of(person.getFirstName()).isPresent())
//        System.out.println(Optional.of(person.getFirstName()).get());

        //System.out.println(Optional.of(person.getFirstName())); //--> Throws NullPointerException
        if(Optional.ofNullable(person.getFirstName()).isPresent())
        System.out.println(Optional.ofNullable(person.getFirstName()).get()); // --> return Optional.empty

        System.out.println(Optional.ofNullable(person.getFirstName()).orElse("that's null man!"));

        person.setLastName(null);
        System.out.println(Optional.ofNullable(person.getLastName()).map(String::toLowerCase).orElseGet(() -> "do some..."));

        List<Person> personList =
        Arrays.asList(
                new Person(null, "Motamed", 35, "mahnoo6@gimal.com", new Person.NationalCode("2345", System.currentTimeMillis())),
                new Person(null, "Javooni", 1, "mahan@gimal.com", new Person.NationalCode("6789", System.currentTimeMillis())),
                person
        );

                Stream<String> stream =personList.stream().map(Person::getFirstName).filter(o -> !Objects.isNull(o));

                    System.out.println(stream.findFirst().orElse("یواش داداش"));
    }
}
