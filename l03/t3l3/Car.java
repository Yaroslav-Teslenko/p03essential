package l03.t3l3;

public class Car  extends Vehicle {
    public Car(double price, double speed, int year, Coordinates latitude, Coordinates longitude) {
        super(price, speed, year, latitude, longitude);
        this.name="Car";
    }
}
