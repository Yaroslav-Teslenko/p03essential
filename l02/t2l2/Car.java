package l02.t2l2;

public class Car {
    private int year;
    private String color ;
    public Car(){
        this.year = 1990;
        this.color = "black";
    }
    public Car(int year) {
        this();
        this.year = year;
    }

    public Car(String color) {
        this();
        this.color = color;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public void showCar(){
        System.out.println("year "+ year+", color: "+color);
    }

}
