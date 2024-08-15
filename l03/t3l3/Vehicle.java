package l03.t3l3;

public class Vehicle {
    protected String name="Vehicle";
    private double price;
    private double speed;
    private int year;
    Coordinates latitude;
    Coordinates  longitude;

    public Vehicle(double price, double speed, int year, Coordinates latitude, Coordinates longitude) {
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.latitude = latitude; // широта
        this.longitude = longitude; //долгота
    }
    public void show(){
        System.out.println("------"+name+"------");
        System.out.println("price: "+price);
        System.out.println("speed: "+speed);
        System.out.println("year: "+year);
        System.out.println("latitude: "+ latitude.getCoordinates());
        System.out.println("longitude: "+longitude.getCoordinates());

    }
}
