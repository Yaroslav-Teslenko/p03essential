package l08.t2l8;

public class Device {
    private String manufacturer;

    private float price;

    private String serialNumber;


    public Device() {
        this.manufacturer = "no manufacturer";
        this.price = 10.0F;
//       TODO   this.serialNumber = "";  если я не иниц , то будет ли ошибка.
    }

    ;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
