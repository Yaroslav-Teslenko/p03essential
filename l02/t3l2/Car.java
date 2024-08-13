package l02.t3l2;

public class Car {


    private int year;
    private double speed;
    private int weigth;
    private String color;

    public Car() {
        this.year = 1900;
        this.speed = 60;
        this.weigth = 3000;
        this.color = "yellow";
    }

    public Car(int year) {
        this.year = year;

    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;

    }

    public Car(int year, double speed, int weigth) {
        this.year = year;
        this.speed = speed;
        this.weigth = weigth;
    }

    public Car(int year, double speed, int weigth, String color) {
        this.year = year;
        this.speed = speed;
        this.weigth = weigth;
        this.color = color;
    }

    public void showCar() {
        System.out.println("year: " + year + ", speed: " + speed + ", weigth: " + weigth + ", color: " + color);
    }
}
