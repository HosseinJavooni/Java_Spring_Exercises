package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Set<String> set = new HashSet<>();

        set.add("Hossein");
        set.add("Mohsen");
        set.add("Mahnoosh");
        set.add("Hossein");

        stringList.add("hamid");
        stringList.add("Mostafa");
        stringList.add("Mahdi");
        stringList.add("hamid");

        set.addAll(set);
        stringList.addAll(stringList);

        set.stream().forEach(System.out::println);
        System.out.println("================");
        stringList.stream().forEach(System.out::println);
    }
}
