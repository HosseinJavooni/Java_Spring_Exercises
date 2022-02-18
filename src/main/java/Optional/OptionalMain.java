package Optional;

import java.util.Date;
import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        Person person;
        person = new Person("Hossein", "Javooni", 37,"h.javooni@gmail",
                new Person.NationalCode("123456", System.currentTimeMillis()));
//        System.out.println(Optional.ofNullable(Person));
        System.out.println(Optional.of(person.getFirstName()));
        person.setFirstName(null);
        //System.out.println(Optional.of(person.getFirstName())); //--> Throws NullPointerException
        System.out.println(Optional.ofNullable(person.getFirstName())); // --> return Optional.empty
    }
}
