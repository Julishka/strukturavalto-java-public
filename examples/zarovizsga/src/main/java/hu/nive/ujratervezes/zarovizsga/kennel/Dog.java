package hu.nive.ujratervezes.zarovizsga.kennel;

public abstract class Dog {
    protected String name;
    protected int happiness;

    public Dog(String name) {
        this.name = name;
        this.happiness=0;
    }

    public String getName() {
        return this.name;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public abstract void feed();

    public abstract void play(int i);
}
