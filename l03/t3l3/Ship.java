package l03.t3l3;

public class Ship  extends Vehicle {
    private int countPassengers;
    String homePort;

    public Ship( int countPassengers, String homePort, double price, double speed, int year, Coordinates latitude, Coordinates longitude) {
        super(price, speed, year, latitude, longitude);
        this.name="Ship";
        this.countPassengers = countPassengers;
        this.homePort = homePort;
    }
    @Override
    public void show() {
        super.show();
        System.out.println("homePort: "+homePort);
        System.out.println("countPassengers: "+countPassengers);
    }
}
