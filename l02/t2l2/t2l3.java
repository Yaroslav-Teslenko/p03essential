package l02.t2l2;

public class t2l3 {
    public static void main(String[] args) {
        Car car1= new Car();
        Car car2= new Car("pink");
        Car car3= new Car(2001);
        Car car4= new Car(1963,"green");

        car1.showCar();
        car2.showCar();
        car3.showCar();
        car4.showCar();
    }
}
