package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office extends Building {
    protected int floorNumber;

    public Office(String address, int area, int floorNumber) {
        super(address, area);
        this.floorNumber = floorNumber;
    }


    @Override
    public int clean() {
        return 0;
    }
}
