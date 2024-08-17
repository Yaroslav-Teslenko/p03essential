package l04.t2l4;

public class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("open doc");
    }

    @Override
    void create() {
        System.out.println("create doc");
    }

    @Override
    void change() {
        System.out.println("change doc");
    }

    @Override
    void save() {
        System.out.println("save doc");
    }
}
