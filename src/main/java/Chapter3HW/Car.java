package Chapter3HW;

public class Car {
    public void start() {
        System.out.println("Let's go");
    }
    public void stop() {
        System.out.println("Stop engine!");
    }
    public int drive(int howLong) {
        return howLong*60;
    }
}
