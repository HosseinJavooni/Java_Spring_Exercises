package lombok;

public class MainLombok {
    public static void main(String[] args) {
        Car car = new Car("QUIK", "saipa", 4);
        System.out.println(car.toString());
        car = Car.builder().countOfWheel(4).name("HosseinJavooni").factory("Saipa").build();
        System.out.println(car);

    }
}
