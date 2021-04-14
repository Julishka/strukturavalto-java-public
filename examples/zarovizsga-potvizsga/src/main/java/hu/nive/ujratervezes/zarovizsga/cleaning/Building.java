package hu.nive.ujratervezes.zarovizsga.cleaning;

public abstract class Building implements Cleanable {
    protected String address;
    protected int area;

    public Building(String address, int area) {
        this.address = address;
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }
}
