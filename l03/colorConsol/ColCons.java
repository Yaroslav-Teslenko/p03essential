package l03.colorConsol;

import java.awt.*;

public class ColCons {
    public static void main(String[] args) {
        System.out.println(ConsoleColors.RED_BOLD+ "RED COLORED" +
                ConsoleColors.RESET + " NORMAL");


        System.out.print(EnumColors.BLACK_BOLD);
        System.out.println("Black_Bold");
        System.out.print(EnumColors.RESET);

        System.out.print(EnumColors.YELLOW);
        System.out.print(EnumColors.BLUE_BACKGROUND);
        System.out.println("YELLOW & BLUE");
        System.out.print(EnumColors.RESET);

        System.out.print(EnumColors.YELLOW);
        System.out.println("YELLOW");
        System.out.print(EnumColors.RESET);


    }
}
