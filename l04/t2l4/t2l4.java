package l04.t2l4;

import l03.t4l3.DocumentWorker;
import l03.t4l3.ExpertDocumentWorker;
import l03.t4l3.ProDocumentWorker;

import java.util.Scanner;

public class t2l4 {
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
