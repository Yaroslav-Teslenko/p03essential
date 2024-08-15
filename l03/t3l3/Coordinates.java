package l03.t3l3;

public class Coordinates {
    private int degree;
    private int minute;
    private int second;

    public Coordinates(int degree, int minute, int second) {
        this.degree = degree;
        this.minute = minute;
        this.second = second;
    }

    public String getCoordinates(){
            return  degree+"\u00B0"+minute+"\u2032"+second+'\u0022' ;
    }
}

