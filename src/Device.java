public class Device {
    private long serialNumber;
    private String brand;
    private String info;
    private int prise;

    public Device() {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.info = info;
        this.prise = prise;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }
}