package l03.t3l3;

public class Plane extends Vehicle {
    private double higth;
    private int countPassengers;


    public Plane(double higth, int countPassengers, double price, double speed, int year, Coordinates latitude, Coordinates longitude) {
        super(price, speed, year, latitude, longitude);
        this.name="Plane";
        this.higth=higth;
        this.countPassengers=countPassengers;

    }

    @Override
    public void show() {
        super.show();
        System.out.println("higth: "+higth);
        System.out.println("countPassengers: "+countPassengers);
    }
}
