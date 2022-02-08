import org.springframework.context.support.ClassPathXmlApplicationContext;
import springBeenPackage.Hossein;
import springBeenPackage.Person;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hi GitHub and java");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Hossein hossein = context.getBean("Hossein", Hossein.class);
        System.out.println(hossein.getFirstName());
    }
}
