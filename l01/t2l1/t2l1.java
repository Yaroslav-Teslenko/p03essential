package l01.t2l1;

import java.util.Scanner;

public class t2l1 {
    public static void main(String[] args) {
        Rectangle rectangle=  new Rectangle();
        Scanner scanner= new Scanner(System.in);
        System.out.print("Input side a ");
        rectangle.setSide1(scanner.nextDouble());
        System.out.print("Input side b ");
        rectangle.setSide2(scanner.nextDouble());

        System.out.println("-------" );
        System.out.println("Area = "+rectangle.area() );
        System.out.println("Perimeter = "+rectangle.perimeter() );
    }
}
