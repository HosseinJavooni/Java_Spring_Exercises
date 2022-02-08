package springBeenPackage;

public class Hossein implements Person{

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Hossein() {
        super();
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
    }

    @Override
    public void wlak() {

    }

    @Override
    public String speak() {
        return null;
    }

    @Override
    public void eat() {

    }
}
