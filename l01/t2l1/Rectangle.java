package l01.t2l1;

public class Rectangle {
    private double side1;
    private  double side2;
    private double areaCalculator (double side1, double side2){
        return side1*side2;
    }
    private double perimeterCalculator (double side1, double side2){
        return (side1+side2)*2;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double area() {
        return areaCalculator(side1, side2);
    }
    public double  perimeter() {
        return perimeterCalculator(side1, side2);
    }

}
