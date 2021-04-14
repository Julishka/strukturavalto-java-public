package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House extends Building {

    public House(String address, int area) {
        super(address, area);
    }

    @Override
    public int clean() {
        return 0;
    }
}
