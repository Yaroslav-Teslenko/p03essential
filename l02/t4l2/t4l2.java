package l02.t4l2;

public class t4l2 {
        public static void main(String[] args) {
        Car car1= new Car();
        Car car2= new Car(1956);
        Car car3= new Car(2001, 90);
        Car car4= new Car(2001, 78, 4000);
        Car car5= new Car(1963,120,3000, "green");

        car1.showCar();
        car2.showCar();
        car3.showCar();
        car4.showCar();
        car5.showCar();
    }
}
