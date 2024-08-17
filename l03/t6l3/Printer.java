package l03.t6l3;

public class Printer {

    public final void print(String value){
        final String COLOR = "\033[0;35m";
        final String RESET = "\033[0m";
        Class<?> cls = this.getClass();
       // System.out.println(cls.getSimpleName());
        //System.out.println(cls.getSuperclass().getSimpleName());
       // if (cls.getSuperclass().getSimpleName().equals("Printer")){
        if (!cls.getSimpleName().equals("Printer")){
            System.out.print(COLOR);
        }
        System.out.println(value);
        System.out.println(RESET);
    }


}
