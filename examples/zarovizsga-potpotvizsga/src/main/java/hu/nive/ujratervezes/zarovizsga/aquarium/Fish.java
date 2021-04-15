package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {
    protected String name;
    protected String color;
    protected int weight;
    protected boolean memoryLoss;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public Fish() {
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }

    public String status() {
        return name + ", weight: " + weight + ", color: " + color + ", short term memory loss: " + memoryLoss;
    }

    public abstract void feed();
}
