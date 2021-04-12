package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    List<Dog> dogs;

    public Kennel() {
        this.dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public List<Dog> getDogs() {
        return this.dogs;
    }

    public void feedAll() {
        for (Dog dog : dogs) {
            dog.feed();
        }
    }

    public Dog findByName(String name) {
        for (Dog dog : dogs) {
            if (dog.getName().equals(name)) {
                return dog;
            }
        }
        throw new IllegalArgumentException("Dog not found by name " + name);
    }

    public void playWith(String name, int hours) {
        for (Dog dog : dogs) {
            if (dog.getName().equals(name)) {
                dog.play(hours);
                return;
            }
        }
        throw new IllegalArgumentException("Dog not found by name " + name);
    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> happyDogs = new ArrayList<>();
        for (Dog dog : dogs) {
            if (dog.getHappiness() > minHappiness) {
                happyDogs.add(dog.getName());
            }
        }
        return happyDogs;
    }
}
