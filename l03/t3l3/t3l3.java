package l03.t3l3;


public class t3l3 {
    public static void main(String[] args) {
        Coordinates lat=  new Coordinates(12, 45, 60);
        Coordinates lon= new Coordinates(14, 75, 10);

        Vehicle vehicle = new Vehicle(23000, 45, 1900,lat , lon );
        vehicle.show();

        Vehicle car = new Car(2300.0, 45, 1956,lat , lon );
        car.show();


        Plane plane=new Plane(5000, 250, 23000, 45, 1971,lat , lon);
        plane.show();


        Ship ship=new Ship(345, "Sidney", 60278, 45, 1985,lat , lon);
        ship.show();

    }
}
