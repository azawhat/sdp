public class Main {
    public static void main(String[] args) {
        Car car = Car.getInstance();
        car.drive();
        car.setDrivingMode(new SportMode());
        car.drive();
    }
}