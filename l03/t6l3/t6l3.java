package l03.t6l3;

public class t6l3 {
    public static void main(String[] args) {
        Printer obj1 = new Printer();
        Test obj2 = new Test();
        Test obj3 = new Test2();

        obj1.print("Parent");
        obj2.print("Child");
        obj3.print("Grandchild");
    }
}
