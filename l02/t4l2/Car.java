package l02.t4l2;

public class Car {


    int year;
    double speed;
    int weigth;
    String color;

    public Car() {
        this.year = 1900;
        this.speed = 60;
        this.weigth = 3000;
        this.color = "yellow";
    }

    public Car(int year) {
        this();
        this.year = year;


    }

    public Car(int year, double speed) {
        this(year);
        this.speed = speed;

    }

    public Car(int year, double speed, int weigth) {
        this(year, speed);
        this.weigth = weigth;
    }

    public Car(int year, double speed, int weigth, String color) {
        this(year, speed, weigth);
        this.color = color;
    }


    public void showCar() {
        System.out.println("year: " + year + ", speed: " + speed + ", weigth: " + weigth + ", color: " + color);
    }
}

