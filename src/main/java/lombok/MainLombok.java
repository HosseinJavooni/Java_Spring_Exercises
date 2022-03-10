package lombok;

public class MainLombok {
    public static void main(String[] args) {
        Car car = new Car("QUIK", "saipa", 4);
        System.out.println(car.toString());

        CarDataAnnotationTest carDataAnnotationTest = new CarDataAnnotationTest();
        carDataAnnotationTest.setFactory("Eshag");
        System.out.println(carDataAnnotationTest.toString());

    }
}
