package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aquarium {
    List<Fish> pod;

    public Aquarium() {
        this.pod = new ArrayList<>();
    }

    public void addFish(Fish fish) {
        Objects.requireNonNull(fish);
        pod.add(fish);
    }

    public void feed() {
        for (Fish fish : pod) {
            fish.feed();
        }
    }

    public void removeFish() {
        List<Fish> fatFish = new ArrayList<>();
        for (Fish fish : pod) {
            if (fish.getWeight() >= 11) {
                fatFish.add(fish);
            }
        }
        pod.removeAll(fatFish);
    }

    public List<String> getStatus() {
        List<String> status = new ArrayList<>();
        for (Fish fish : pod) {
            status.add(fish.status());
        }
        return status;
    }
}
