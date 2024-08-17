package l04.t2l4;

import java.util.Scanner;

public class t2l4 {
    /*Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас AbstractHandler.
    У тілі класу створити методи void open(), void create(), void change(), void save().
    Створити похідні класи XMLHandler, TXTHandler, DOCHandler від базового класу AbstractHandler.
    Написати програму, яка виконуватиме визначення документа і для кожного формату мають бути методи відкриття,
    створення, редагування, збереження певного формату документа.*/
    public static void main(String[] args) {
        AbstractHandler document;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input document type: ");
        String key = (scanner.nextLine()).trim();
        switch (key){
            case "xml"-> {document=new XMLHandler();}
            case "doc"-> {document=new DOCHandler();}
            default -> {
                document = new TXTHandler();
            }
        }
        document.create();
        document.open();
        document.change();
        document.save();
    }
}
