package l03.t2l3;

public class t2l3 {
    public static void main(String[] args) {
        ClassRoom classRoom1= new ClassRoom(new ExcelentPupil("Jon"));
        ClassRoom classRoom2= new ClassRoom(new ExcelentPupil("Jon"), new BadPupil("Ivan"));
        ClassRoom classRoom3= new ClassRoom(new ExcelentPupil("Jon"), new BadPupil("Ivan"), new GoodPupil("Mery"));
        ClassRoom classRoom4= new ClassRoom(new ExcelentPupil("Jon"), new BadPupil("Ivan"), new GoodPupil("Mery"), new BadPupil("Max"));
        classRoom1.showClassRoom();
        classRoom2.showClassRoom();
        classRoom3.showClassRoom();
        classRoom4.showClassRoom();
    }
}
