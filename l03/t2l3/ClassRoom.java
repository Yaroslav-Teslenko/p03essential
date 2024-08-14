package l03.t2l3;

public class ClassRoom {
    private Pupil[] pupils;

    public ClassRoom(Pupil pupil) {
        pupils = new Pupil[]{pupil};
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        pupils = new Pupil[]{pupil1,pupil2};
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        pupils = new Pupil[]{pupil1,pupil2, pupil3};
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3,Pupil pupil4) {
        pupils = new Pupil[]{pupil1,pupil2, pupil3, pupil4};
    }

    public void showClassRoom() {
        System.out.println("------");
        for (Pupil item : pupils) {
            item.name();
            item.study();
            item.read();
            item.relax();
            item.write();
        }
    }
}
