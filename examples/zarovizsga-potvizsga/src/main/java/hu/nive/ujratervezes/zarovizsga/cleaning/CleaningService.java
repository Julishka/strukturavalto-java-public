package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.List;

public class CleaningService {
    protected List<Cleanable> cleanables;

    public CleaningService() {
        this.cleanables = new ArrayList<>();
    }

    public void add(Cleanable cleanable) {
        cleanables.add(cleanable);
    }

    public int cleanAll() {
        //TODO
        return 0;
    }

    public int cleanOnlyOffices() {
        //TODO
        return 0;
    }

    public List<Cleanable> findByAddressPart(String address) {
        //TODO
        return null;
    }

    public String getAddresses() {
        //TODO
        return null;
    }

    public List<Cleanable> getCleanables() {
        return cleanables;
    }
}
