package l04.t2l4;

public class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("open xml");
    }

    @Override
    void create() {
        System.out.println("create xml");
    }

    @Override
    void change() {
        System.out.println("change xml");
    }

    @Override
    void save() {
        System.out.println("save xml");
    }
}
