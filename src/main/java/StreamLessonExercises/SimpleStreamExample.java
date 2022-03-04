package StreamLessonExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SimpleStreamExample {
    public static void main(String[] args) {

        List<String> familyNames = new ArrayList<>();
        familyNames.add("Hossein");
        familyNames.add("Mahnoosh");
        familyNames.add("Mahan");

        Stream<String> familyStream = familyNames.stream();

        familyStream.forEach(System.out::println);

    }
}
