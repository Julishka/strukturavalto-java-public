package hu.nive.ujratervezes.zarovizsga.kennel;

public abstract class Dog {
    String name;
    Integer happiness;

    public Dog(String name) {
        this.name = name;
        this.happiness = 0;
    }

    public String getName() {
        return name;
    }

    public Integer getHappiness() {
        return happiness;
    }

    public abstract void feed();

    public abstract void play(int i);
}
