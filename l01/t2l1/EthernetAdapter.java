package l01.t2l1;

public class EthernetAdapter extends Device{
    private  int speed;
    private String mac;

    public EthernetAdapter(int speed, String mac) {
        super();
        this.speed = 24;
    }

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {

        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
