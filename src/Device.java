import java.util.Comparator;
import java.util.Objects;

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





    @Override
    public String toString() {
        return "Device{" +
                "serialNumber=" + serialNumber +
                ", brand='" + brand + '\'' +
                ", info='" + info + '\'' +
                ", prise=" + prise +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return serialNumber == device.serialNumber &&
                prise == device.prise &&
                Objects.equals(brand, device.brand) &&
                Objects.equals(info, device.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, brand, info, prise);
    }



}