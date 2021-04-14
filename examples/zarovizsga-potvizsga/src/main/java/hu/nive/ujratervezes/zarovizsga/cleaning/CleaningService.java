package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CleaningService {
    protected List<Cleanable> cleanables;

    public CleaningService() {
        this.cleanables = new ArrayList<>();
    }

    public void add(Cleanable cleanable) {
        Objects.requireNonNull(cleanable);
        cleanables.add(cleanable);
    }

    public int cleanAll() {
        int cost = 0;
        for (Cleanable cleanable : cleanables) {
            cost += cleanable.clean();
        }
        cleanables.removeAll(cleanables);
        return cost;
    }

    public int cleanOnlyOffices() {
        int cost = 0;
        List<Cleanable> houses = new ArrayList<>();

        for (Cleanable cleanable : cleanables) {
            if (cleanable instanceof Office) {
                cost += cleanable.clean();
            } else {
                houses.add(cleanable);
            }
        }

        cleanables.removeAll(cleanables);
        cleanables.addAll(houses);
        return cost;
    }

    public List<Cleanable> findByAddressPart(String address) {
        Objects.requireNonNull(address);
        List<Cleanable> containsAddress = new ArrayList<>();
        for (Cleanable cleanable : cleanables) {
            if (cleanable.getAddress().contains(address)) {
                containsAddress.add(cleanable);
            }
        }
        return containsAddress;
    }

    public String getAddresses() {
        StringBuilder sb = new StringBuilder();
        String prefix = "";
        for (Cleanable cleanable : cleanables) {
            sb.append(prefix);
            prefix = ", ";
            sb.append(cleanable.getAddress());
        }
        return sb.toString();
    }

    public List<Cleanable> getCleanables() {
        return cleanables;
    }
}
