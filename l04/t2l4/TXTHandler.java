package l04.t2l4;

public class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("open txt");
    }

    @Override
    void create() {
        System.out.println("create txt");
    }

    @Override
    void change() {
        System.out.println("change txt");
    }

    @Override
    void save() {
        System.out.println("save txt");
    }
}
