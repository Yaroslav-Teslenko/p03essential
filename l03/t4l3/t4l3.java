package l03.t4l3;

import java.util.Scanner;

public class t4l3 {
    public static void main(String[] args) {
        DocumentWorker documentWorker;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ключ");
        String key = (scanner.nextLine()).trim();
        switch (key){
            case "pro"-> {documentWorker=new ProDocumentWorker();}
            case "exp"-> {documentWorker=new ExpertDocumentWorker();}
            default -> {
                documentWorker = new DocumentWorker();
            }
        }


        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}
