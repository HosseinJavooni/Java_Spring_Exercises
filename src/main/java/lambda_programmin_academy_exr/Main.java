package lambda_programmin_academy_exr;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FinctionalImpl finctionalImpl = new FinctionalImpl();
        Functional functional = finctionalImpl::doSome;//()-> System.out.println("Hi lambda!");
        System.out.println(functional.doSome(3, 2));

        System.out.println("----------------");

        List<Integer>  list = Arrays.asList(1, 2, 3, 4, 5);

        FunctionInterfaceImpl functionInterface = new FunctionInterfaceImpl();

        list.stream().map(functionInterface::squer).filter(x -> x>4).forEach(System.out::println);

    }
}
