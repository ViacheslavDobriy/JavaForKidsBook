package Chapter3HW;

public class CarOwner {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();
        System.out.printf("%d - it is just car\n", car1.drive(12));
        car1.stop();

        Car car2 = new JamesBondCar();
        car2.start();
        System.out.printf("%d - it is James Bond car\n", car2.drive(12));
        car2.stop();
    }
}
